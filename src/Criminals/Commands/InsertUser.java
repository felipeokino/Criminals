//package Criminals.Commands;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//public class InsertUser implements Command {
//
////	@Override
////	public String execute(HttpServletRequest req,
////                          HttpServletResponse resp)
////									throws Exception {
//////		String id = req.getParameter("id");
//////		String desc = req.getParameter("descricao");
//////		String preco = req.getParameter("preco");
//////		Produto produto = new Produto();
//////		produto.setId(Integer.parseInt(id));
//////		produto.setDescricao(desc);
//////		produto.setPreco(Double.parseDouble(preco));
//////		ProdutoDAO dao = new ProdutoDAO();
//////		dao.inserir(produto);
//////		req.getServletContext().setAttribute("produtos",
//////								dao.getProdutos());
//////		return "/WEB-INF/visao/admin.jsp";
////
////		String name = req.getParameter("name");
////
////	}
//
//}
