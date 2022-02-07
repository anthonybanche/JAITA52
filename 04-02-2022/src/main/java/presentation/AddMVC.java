package presentation;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Database;
import model.Prodotto;

import java.io.IOException;
import java.util.List;

@WebServlet("/aggiungiProdotto")
public class AddMVC extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Database db = Database.getDatabase();
		List<Prodotto> lista = db.getLista();
		
		lista.add(new Prodotto(
				lista.size(), //Non è possibile fare lista.size()++
				request.getParameter("nome"), 
				Double.parseDouble(request.getParameter("prezzo")),
				request.getParameter("reparto")
				));
		
		request.setAttribute("lista", lista);
		request.getRequestDispatcher("lista.jsp").forward(request, response);
	}

}
