package Criminals.Controle;
import java.io.IOException;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/controle")
public class ControleServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public void init() {
        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("lojajpapu");
        ProdutoRepositorio dao =
                new ProdutoRepositorio(factory.createEntityManager());
        getServletContext().setAttribute("produtos",
                dao.getProdutos());
        factory.close();
    }

    protected void service(HttpServletRequest request,
                           HttpServletResponse response)
            throws ServletException,
            IOException {

        String acao = request.getParameter("comando");
        String nomeClasse = "loja.comando." + acao;

        try {
            Class<?> classe = Class.forName(nomeClasse);
            Comando comando = (Comando) classe.newInstance();
            String url = comando.execute(request, response);
            request.getRequestDispatcher(url).forward(request, response);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}

