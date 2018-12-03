package Criminals.Comando;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Deslogar {

    @Override
    public String execute(HttpServletRequest req,
                          HttpServletResponse resp)
            throws Exception {
        req.getSession().invalidate();
        return "/login.jsp";
    }
}