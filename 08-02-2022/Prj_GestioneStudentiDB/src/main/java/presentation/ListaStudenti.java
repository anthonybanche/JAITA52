package presentation;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import repository.Database;
import model.Studente;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import controller.StudenteController;

@WebServlet("/listaStudenti")
public class ListaStudenti extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private StudenteController controller;
	
	public ListaStudenti() throws ClassNotFoundException, SQLException {
		super();
		controller=StudenteController.getController();
	}

	//Solitamente usato per richiedere dati al server
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			List<Studente> listaStudenti = controller.getAllStudente();
			request.setAttribute("listaStudenti", listaStudenti); //Permette di mappare sotto la chiave "lista" il valore della variabile lista
		}catch(Exception e) {
			e.printStackTrace();
			request.setAttribute("avvisoMessaggio", e.getMessage());
		}
		
		request.getRequestDispatcher("lista.jsp").forward(request, response);
	}
	
	//Solitamente utilizzato per aggiornare dati sul server
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			List<Studente> listaStudenti = controller.getAllStudente();
			request.setAttribute("listaStudenti", listaStudenti); //Permette di mappare sotto la chiave "lista" il valore della variabile lista
		}catch(Exception e) {
			e.printStackTrace();
			request.setAttribute("avvisoMessaggio", e.getMessage());
		}
		
		request.getRequestDispatcher("lista.jsp").forward(request, response);
	}

}
