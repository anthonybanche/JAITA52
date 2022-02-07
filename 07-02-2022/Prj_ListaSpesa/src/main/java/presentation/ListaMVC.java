package presentation;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import repository.Database;
import utility.SessionGuard;
import model.Prodotto;

import java.io.IOException;
import java.util.List;

@WebServlet("/listaSpesa")
public class ListaMVC extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SessionGuard.getSessionGuard().validateSession(request, response);
		try {
			Database db = Database.getDatabase();

			String mailUtente=request.getSession().getAttribute("email").toString();

			List<Prodotto> lista = db.getListaSpesa(mailUtente);
			request.setAttribute("lista", lista); //Permette di mappare sotto la chiave "lista" il valore della variabile lista

		}catch(Exception e) {
			e.printStackTrace();
			request.setAttribute("errorMessage", e.getMessage());
		}
		request.getRequestDispatcher("lista.jsp").forward(request, response);
	}

}
