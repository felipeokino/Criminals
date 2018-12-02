package Criminals.Command;

import Criminals.DAO.UserDAO;
import Criminals.Model.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login implements Command {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String login = request.getParameter("login");
        String password = request.getParameter("password");

        UserDAO userDAO = new UserDAO();
        User user = userDAO.login(login, password);

        String path = "";
        if (user != null){
            if (user.getLevel().equals("admin")){
                path = "adminMain.jsp";
            } else if (user.getLevel().equals("user")) {
                path = "userMain.jsp";
            } else {
                path = "index.jsp";
            }
        }
        System.out.println(path);

        return path;
    }
}
