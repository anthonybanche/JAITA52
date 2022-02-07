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

@WebServlet("/listaSpesa")
public class ListaMVC extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Database db = Database.getDatabase();
		
		List<Prodotto> lista = db.getLista();
		request.setAttribute("lista", lista); //Permette di mappare sotto la chiave "lista" il valore della variabile lista
		
		request.getRequestDispatcher("lista.jsp").forward(request, response);
	}

}
