package presentation;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import repository.Database;
import model.Persona;

@WebServlet("/login")
public class LoginController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String email = req.getParameter("email");
		String password = req.getParameter("password");

		try {
			Database db = Database.getDatabase();
			Persona persona = db.getPersona(email);
			if(persona!=null) {
	
					if (persona.getPassword().equals(password)) {
						if (persona.isLogin()) {
							// PERSONA GI� AUTENTICATA
						} else {
							persona.setLogin(true);
							req.getSession().setAttribute("email", persona.getEmail());
							req.getSession().setAttribute("nome", persona.getNome());
							req.getSession().setAttribute("cognome", persona.getCognome());
							req.getRequestDispatcher("/profilo.jsp").forward(req, res);
						}
					} else {
						// PASSWORD ERRATA
					}
				}else{
				 throw new Exception("Non esiste un utente per quella mail");
				}
			
		}catch(SQLException se) {
			se.printStackTrace();
			req.setAttribute("errorMessage", "Errore di database");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			req.setAttribute("errorMessage", "Errore di database - Impossibile caricare driver");
		} catch (Exception e) {
			req.setAttribute("errorMessage", e.getMessage());
			req.getRequestDispatcher("/login.jsp").forward(req, res);
		}
		

	}

}
