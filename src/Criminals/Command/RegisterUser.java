package Criminals.Command;

import Criminals.DAO.UserDAO;
import Criminals.Model.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterUser implements Command {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String cpf = request.getParameter("cpf");
        String first_name = request.getParameter("first_name");
        String last_name = request.getParameter("last_name");
        String niver = request.getParameter("niver");
        String office = request.getParameter("office");
        String level = request.getParameter("level");
        String login = request.getParameter("login");
        String password = request.getParameter("passwd");

        User user = new User();
        user.setCpf(cpf);
        user.setName(first_name + " " + last_name);
        user.setBirth(niver);
        user.setOffice(office);
        user.setLevel(level);
        user.setLogin(login);
        user.setPassword(password);

        UserDAO userDAO = new UserDAO();
        userDAO.inserir(user);
        request.getServletContext().setAttribute("user", user);
        return "adminMain.jsp";
    }
}

