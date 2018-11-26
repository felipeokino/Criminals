package Criminals.Command;

import Criminals.DAO.CriminalDAO;
import Criminals.Model.Criminal;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterCriminal implements Command {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String cpf = request.getParameter("cpf");
        String first_name = request.getParameter("first_name");
        String last_name = request.getParameter("last_name");
        String birth = request.getParameter("birth");
//        String gang = request.getParameter("gang");

        Criminal criminal = new Criminal();
        criminal.setFirst_name(first_name);
        criminal.setLast_name(last_name);
        criminal.setCpf(cpf);
        criminal.setBirth_date(birth);

        CriminalDAO criminalDAO = new CriminalDAO();
        criminalDAO.inserir(criminal);
        return "userMain.jsp";
    }
}
