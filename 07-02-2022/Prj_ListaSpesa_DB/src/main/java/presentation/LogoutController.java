package presentation;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import repository.Database;
import model.Persona;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/logout")
public class LogoutController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String email = (String) request.getSession().getAttribute("email");
			Database db = Database.getDatabase();
			for(Persona p : db.getListaPersone()) {
				if(p.getEmail().equals(email) && p.isLogin()) {
					p.setLogin(false);
					request.getSession().setAttribute("email", null);
				}
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			request.setAttribute("errorMessage", e.getMessage());
		}
		
		request.getSession().invalidate();
		request.getRequestDispatcher("/login.jsp").forward(request, response);
	}

}
