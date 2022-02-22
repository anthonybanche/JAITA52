package com.nicassio.canzoni.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nicassio.canzoni.model.Prodotto;
import com.nicassio.canzoni.model.Utente;
import com.nicassio.canzoni.repository.ProdottiDB;
import com.nicassio.canzoni.repository.UtentiDB;

@Service
public class ProdottiService {
	
	@Autowired
	ProdottiDB db;
	
	public List<Prodotto> getListaProdotti() {
		
		return db.getAll(); //Passacarte
		
	}

}
