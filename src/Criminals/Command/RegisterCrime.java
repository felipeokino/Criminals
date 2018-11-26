package Criminals.Command;

import Criminals.DAO.CrimeDAO;
import Criminals.Model.Crime;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterCrime implements Command {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String type = request.getParameter("type");
        String criminal = request.getParameter("criminal");
        String neigh = request.getParameter("neigh");
        String date = request.getParameter("date");

        Crime crime = new Crime();
        crime.setDescription(type);
        crime.setDate(date);
//        crime.setCriminal(criminal);
        CrimeDAO crimeDAO = new CrimeDAO();
        crimeDAO.inserir(crime);

        return "userMain.jsp";
    }
}
