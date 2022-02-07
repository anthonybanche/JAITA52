package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import exceptions.UtenteBannatoException;
import model.Persona;
import model.Prodotto;

public class Database {

	private static Database instance;
	
	private Connection con;
	
	private final static String DB_URL = "jdbc:mysql://localhost:3306/mydatabasename?";
	private final static String DB_USER = "root";
	private final static String DB_PASSWORD = "root";
	private final static String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	
	private Database() throws SQLException, ClassNotFoundException {
		Class.forName(DB_DRIVER);
		con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
	}
	
	public static Database getDatabase() throws ClassNotFoundException, SQLException {
		if (instance == null) {
			instance = new Database();
		}
		return instance;
	}
	
	public List<Prodotto> getListaSpesa(String mail) throws UtenteBannatoException{
		 List<Prodotto> lp=new ArrayList();
		 return lp;
	}
	
	public List<Persona> getListaPersone() throws SQLException{
		PreparedStatement pst= con.prepareStatement("SELECT * FROM UTENTI;");
		ResultSet listaRisultati=pst.executeQuery();
		
		List<Persona> listaPersone=new ArrayList<Persona>();
		
		while(listaRisultati.next()) {
			Persona p=new Persona();
			p.setNome(listaRisultati.getString("NOME"));
			p.setCognome(listaRisultati.getString("COGNOME"));
			p.setEmail(listaRisultati.getString("EMAIL"));
			p.setPassword(listaRisultati.getString("PASSWORD"));
			listaPersone.add(p);
			
		}
		
		return listaPersone;
		
	}
	
	public Persona getPersona(String email) throws SQLException{
		PreparedStatement pst= con.prepareStatement("SELECT * FROM UTENTI WHERE EMAIL=?;");
		
		pst.setString(1, email);
		
		ResultSet listaRisultati=pst.executeQuery();
		
		while(listaRisultati.next()) {
			Persona p=new Persona();
			p.setNome(listaRisultati.getString("NOME"));
			p.setCognome(listaRisultati.getString("COGNOME"));
			p.setEmail(listaRisultati.getString("EMAIL"));
			p.setPassword(listaRisultati.getString("PASSWORD"));
			return p;
			
		}
		
		return null;
		
	}
	
	//In questo modo saremo in grado di istanziare una volta soltanto l'oggetto database = Singleton.
}
