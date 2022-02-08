package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Studente;

public class Database {

	private static Database instance;
	
	private Connection con;
	
	private final static String DB_URL = "jdbc:mysql://localhost:3306/generation";
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
	
	
	public boolean insertStudente(Studente stu) throws SQLException{
		String sql="INSERT INTO generation.studente "
				+ " (nome, cognome, genere, indirizzo, citta, provincia, regione, email, data_nascita)"
				+ " VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?);";
		
		PreparedStatement istruzione= con.prepareStatement(sql);
		
		istruzione.setString(1, stu.getNome());
		istruzione.setString(2, stu.getCognome());
		istruzione.setString(3, stu.getGenere());
		istruzione.setString(4, stu.getIndirizzo());
		istruzione.setString(5, stu.getCitta());
		istruzione.setString(6, stu.getProvincia());
		istruzione.setString(7, stu.getRegione());
		istruzione.setString(8, stu.getEmail());
		istruzione.setDate(9, stu.getDataNascita());
		
		
		int numRigheModificate=istruzione.executeUpdate();
		
		if(numRigheModificate==1) return true;
		
		return false;
	}
	
	
}
