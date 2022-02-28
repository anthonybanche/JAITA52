package com.delprete.supermercato.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.delprete.supermercato.model.Utente;
import com.delprete.supermercato.repository.UtentiDB;

@Service
public class UtentiService {
	
	@Autowired
	UtentiDB db;
	
	public Utente login(Utente ut) throws Exception {
		
		List<Utente> lista = db.findAll(); // -> fa in automatico la query per tirare dati dalla tabella utente
		
		for (Utente utente : lista) {
			
			if(utente.getEmail().equals(ut.getEmail())) { //Esiste un utente con quella password?
				
				if(utente.getPassword().equals(ut.getPassword())) { //Se esiste, la password inserita è corretta?
					
					return utente;
					
				}
			}
			
		}
		
		throw new Exception("Credenziali errate.");
		
	}
	
	public void registraUtente(Utente input) {
		db.save(input); 
	}

}
