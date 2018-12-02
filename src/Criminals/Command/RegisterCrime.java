package Criminals.Command;

import Criminals.DAO.CrimeDAO;
import Criminals.DAO.CriminalDAO;
import Criminals.DAO.GangDAO;
import Criminals.DAO.NeighborhoodDAO;
import Criminals.Model.Crime;
import Criminals.Model.Criminal;
import Criminals.Model.Gang;
import Criminals.Model.Neighborhood;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterCrime implements Command {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String type = request.getParameter("type");
        String criminal = request.getParameter("criminal");
        String gang  =request.getParameter("gang");
        String neigh = request.getParameter("neigh");
        String date = request.getParameter("date");
        String desc = request.getParameter("desc");

        GangDAO gangDAO = new GangDAO();
        CriminalDAO criminalDAO = new CriminalDAO();
        NeighborhoodDAO neighborhoodDAO = new NeighborhoodDAO();

        Criminal criminal1 = criminalDAO.getCriminalById(Long.parseLong(criminal));
        Gang gang1 = gangDAO.getGangById(Long.parseLong(gang));
        Neighborhood neighborhood = neighborhoodDAO.getNeighById(Long.parseLong(neigh));

        Crime crime = new Crime();

        String c = type + ":" + desc;

        crime.setDescription(c);
        crime.setDate(date);
        crime.setCriminal(criminal1);
        crime.setGang(gang1);
        crime.setLocal(neighborhood);

        CrimeDAO crimeDAO = new CrimeDAO();
        crimeDAO.inserir(crime);

        return "userMain.jsp";
    }
}
