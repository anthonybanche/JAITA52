package com.delprete.supermercato.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.delprete.supermercato.model.Prodotto;
import com.delprete.supermercato.repository.ProdottiDB;

@Service
public class ProdottiService {
	
	@Autowired
	ProdottiDB db;
	
	public List<Prodotto> getListaProdotti() {
		
		return db.findAll(); //Passacarte
	}
}
