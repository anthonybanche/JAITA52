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

@WebServlet("/removeProdotto")
public class RemoveMVC extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id = Integer.parseInt(req.getParameter("id"));
		Database db = Database.getDatabase();
		List<Prodotto> lista = db.getLista();
		
		for(Prodotto p : lista) {
			if(p.getId() == id) {
				lista.remove(p);
				break;
			}
		}

		req.setAttribute("lista", lista);
		req.getRequestDispatcher("lista.jsp").forward(req, resp);
	}
	
}
