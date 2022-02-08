package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
		
		//executeUpdate si usa per INSERT, UPDATE, DELETE
		int numRigheModificate=istruzione.executeUpdate();
		
		if(numRigheModificate==1) return true;
		
		return false;
	}
	
	public int updateStudente(Studente stu) throws SQLException{
		String sql="UPDATE generation.studente "
				+ " SET nome=?, cognome=?, genere=?, indirizzo=?, citta=?, provincia=?, regione=?, email=?, data_nascita=? "
				+ " WHERE id=? ; ";
		
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
		
		istruzione.setInt(10, stu.getId());
		
		//executeUpdate si usa per INSERT, UPDATE, DELETE
		return istruzione.executeUpdate();
		
	}
	
	public int deleteStudente(Studente stu) throws SQLException{
		String sql="DELETE FROM generation.studente WHERE id=? ; ";
		
		PreparedStatement istruzione= con.prepareStatement(sql);		
		istruzione.setInt(1, stu.getId());
		
		//executeUpdate si usa per INSERT, UPDATE, DELETE
		return istruzione.executeUpdate();
	}
	
	public Studente getStudenteById(int id) throws SQLException{
		String sql="SELECT id, nome, cognome, genere, indirizzo, citta, provincia, regione, email, data_nascita, ins "
				+ " FROM generation.studente "
				+ " WHERE id=? ; ";
		
		PreparedStatement istruzione= con.prepareStatement(sql);		
		istruzione.setInt(1, id);
		
		//executeQuery si usa per le SELECT
		ResultSet risultatiQuery=istruzione.executeQuery();
		while(risultatiQuery.next()) {
			Studente rstu=new Studente();
			rstu.setId(risultatiQuery.getInt("id"));
			rstu.setNome(risultatiQuery.getString("nome"));
			rstu.setCognome(risultatiQuery.getString("cognome"));
			rstu.setGenere(risultatiQuery.getString("genere"));
			rstu.setIndirizzo(risultatiQuery.getString("indirizzo"));
			rstu.setCitta(risultatiQuery.getString("citta"));
			rstu.setProvincia(risultatiQuery.getString("provincia"));
			rstu.setRegione(risultatiQuery.getString("regione"));
			rstu.setEmail(risultatiQuery.getString("email"));
			rstu.setDataNascita(risultatiQuery.getDate("data_nascita"));
			rstu.setDataInserimento(risultatiQuery.getDate("ins"));
			
			return rstu;
		}
		
		return null;
	}
	
	public List<Studente> getAllStudente() throws SQLException{
		String sql="SELECT id, nome, cognome, genere, indirizzo, citta, provincia, regione, email, data_nascita, ins "
				+ " FROM generation.studente ";
		
		PreparedStatement istruzione= con.prepareStatement(sql);		
		
		//executeQuery si usa per le SELECT
		ResultSet risultatiQuery=istruzione.executeQuery();
		
		//Monto una lista vuota di studenti
		List<Studente> listaStudenti=new ArrayList<>();
		
		while(risultatiQuery.next()) {
			//Per ogni record che arriva da DB istanzio uno studente
			Studente rstu=new Studente();
			//Ci imposto dentro le varie colonne della sua riga
			rstu.setId(risultatiQuery.getInt("id"));
			rstu.setNome(risultatiQuery.getString("nome"));
			rstu.setCognome(risultatiQuery.getString("cognome"));
			rstu.setGenere(risultatiQuery.getString("genere"));
			rstu.setIndirizzo(risultatiQuery.getString("indirizzo"));
			rstu.setCitta(risultatiQuery.getString("citta"));
			rstu.setProvincia(risultatiQuery.getString("provincia"));
			rstu.setRegione(risultatiQuery.getString("regione"));
			rstu.setEmail(risultatiQuery.getString("email"));
			rstu.setDataNascita(risultatiQuery.getDate("data_nascita"));
			rstu.setDataInserimento(risultatiQuery.getDate("ins"));
			//Lo aggiungo alla lista degli studenti
			listaStudenti.add(rstu);
		}
		
		//Quando ho finito di leggere cosa mi è arrivato dal DB
		//ritorno al chiamante la lista di studenti
		return listaStudenti;
	}
}
