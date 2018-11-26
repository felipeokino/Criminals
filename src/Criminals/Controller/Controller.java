package Criminals.Controller;

import Criminals.Command.Command;
import Criminals.DAO.CrimeDAO;
import Criminals.DAO.CriminalDAO;
import Criminals.DAO.NeighborhoodDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/controller")
public class Controller extends HttpServlet{
     private static final long serialVersionUID = 1L;

    public void init() {
        CriminalDAO dao = new CriminalDAO();
        getServletContext().setAttribute("criminals",
                dao.getCriminals());

        CrimeDAO crimeDAO = new CrimeDAO();
        getServletContext().setAttribute("crimes", crimeDAO.getCrimes());

        NeighborhoodDAO neighborhoodDAO = new NeighborhoodDAO();
        getServletContext().setAttribute("neighs", neighborhoodDAO.getNeighs());
    }


    protected void service(HttpServletRequest request,
                               HttpServletResponse response)
                throws ServletException,
                IOException {

            String acao = request.getParameter("command");
            String nomeClasse =  "Criminals.Command." + acao;

            try {
                Class<?> classe = Class.forName(nomeClasse);
                Command command = (Command) classe.newInstance();
                String url = command.execute(request, response);
                request.getRequestDispatcher(url).forward(request, response);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }


