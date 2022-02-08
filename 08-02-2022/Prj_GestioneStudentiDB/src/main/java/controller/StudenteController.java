package controller;

import java.sql.SQLException;
import java.sql.Date;
import java.util.List;

import model.Studente;
import repository.Database;

public class StudenteController {

	private static StudenteController instance;
	
	private Database db;
	
	public StudenteController() throws ClassNotFoundException, SQLException {
		db = Database.getDatabase();
	}
	
	public static StudenteController getController() throws ClassNotFoundException, SQLException {
		if (instance == null) {
			instance = new StudenteController();
		}
		return instance;
	}
	
	
	public boolean insertStudente(String nome, String cognome, String genere, String indirizzo, String citta, String prov, String reg, String email, Date dataNascita) throws SQLException{
		Studente daInserire=new Studente();
		
		daInserire.setNome(nome);
		daInserire.setCognome(cognome);
		daInserire.setGenere(genere);
		daInserire.setIndirizzo(indirizzo);
		daInserire.setCitta(citta);
		daInserire.setProvincia(prov);
		daInserire.setRegione(reg);
		daInserire.setDataNascita(dataNascita);
		daInserire.setEmail(email);
		
		return db.insertStudente(daInserire);
	}
	
	public int updateStudente(int id, String nome, String cognome, String genere, String indirizzo, String citta, String prov, String reg, String email, Date dataNascita) throws SQLException{
		Studente daAggiornare=new Studente();
		
		daAggiornare.setId(id);
		daAggiornare.setNome(nome);
		daAggiornare.setCognome(cognome);
		daAggiornare.setGenere(genere);
		daAggiornare.setIndirizzo(indirizzo);
		daAggiornare.setCitta(citta);
		daAggiornare.setProvincia(prov);
		daAggiornare.setRegione(reg);
		daAggiornare.setDataNascita(dataNascita);
		daAggiornare.setEmail(email);
		
		return db.updateStudente(daAggiornare);
	}
	
	public int deleteStudente(int id) throws SQLException{
		Studente daCancellare=new Studente();
		daCancellare.setId(id);
		
		return db.deleteStudente(daCancellare);
	}
	
	public Studente getStudenteById(int id) throws SQLException{
		return db.getStudenteById(id);
	}
	
	public List<Studente> getAllStudente() throws SQLException{
		return db.getAllStudente();
	}
}
