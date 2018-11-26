package Criminals.Command;

import Criminals.DAO.NeighborhoodDAO;
import Criminals.Model.Neighborhood;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterNeigh implements Command {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String name = request.getParameter("nameNeigh");
        String city = request.getParameter("city");

        Neighborhood neighborhood = new Neighborhood();
        neighborhood.setName(name);
        neighborhood.setCity(city);

        NeighborhoodDAO neighborhoodDAO = new NeighborhoodDAO();

        neighborhoodDAO.inserir(neighborhood);

        return "adminMain.jsp";
    }
}
