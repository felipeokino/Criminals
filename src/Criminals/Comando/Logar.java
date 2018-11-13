package Criminals.Comando;

import Criminals.Model.User;
import Criminals.Repositorio.UserRepos;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.persistence.EntityManager;


public class Logar implements Comando{

       @Override
       public String execute(HttpServletRequest req, HttpServletResponse resp) throws Exception {

            User user = new User();
            user.setLogin(req.getParameter("usuario"));
            user.setPassword(req.getParameter("senha"));

           UserRepos rep = new UserRepos((EntityManager) req.getAttribute("manager"));

           String url = "/login.jsp";

            if (rep.verifica(user)){
                HttpSession sessao = req.getSession();
                sessao.setMaxInactiveInterval(120);
                sessao.setAttribute("usuario", user.getLogin());
                if (user.getLogin().equals("admin")) {
                    url = "/WEB-INF/visao/admin.jsp";
                } else {
                    url = "/WEB-INF/visao/usuario.jsp";
                }

            }
            return url;
       }
}

