package utility;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SessionGuard {
	
	static SessionGuard instance;
	
	public static SessionGuard getSessionGuard() {
		if (instance == null) {
			instance = new SessionGuard();
		}
		return instance;
	}
	
	public void validateSession(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if(request.getSession()==null || request.getSession().getAttribute("email")==null) {
			request.getRequestDispatcher("sessioneScaduta.jsp").forward(request, response);
		}
	
	}
}
