package com.nicassio.canzoni.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.nicassio.canzoni.model.Utente;

@Repository
public class UtentiDB {
	
	List<Utente> lista;
	
	public UtentiDB() {
		lista = new ArrayList(
					Arrays.asList(
					new Utente(1, "Mario", "Rossi", "Via Roma 1", "admin@gmail.com", "1234"),
					new Utente(2, "Carlo", "Verdi", "Via Roma 2", "gverdi@gmail.com", "789012"),
					new Utente(3, "Fulvio", "Bianchi", "Via Roma 3", "fbianchi@gmail.com", "345678")
		));
	}
	
	public List<Utente> getAll(){
		return lista;
	}
	
	public void addUtente(Utente c) {
		lista.add(c);
	}
	
	public Utente getById(int id) {
		for(Utente c:lista) {
			if(id==c.getId()) return c;
		}
		return null;
	}
	
	public void saveById(Utente c) {
		Utente vecchia = getById(c.getId());
		lista.remove(vecchia);
		lista.add(c);
	}
	
	public void deleteById(int id) {
		
		lista.remove(getById(id));
	}
}
