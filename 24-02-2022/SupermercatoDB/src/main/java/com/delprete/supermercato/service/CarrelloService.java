package com.delprete.supermercato.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.delprete.supermercato.model.Carrello;
import com.delprete.supermercato.model.Prodotto;
import com.delprete.supermercato.model.Utente;
import com.delprete.supermercato.repository.ProdottiDB;
import com.delprete.supermercato.repository.UtentiDB;

@Service
public class CarrelloService {
	
	@Autowired
	UtentiDB dbUte;
	
	@Autowired
	ProdottiDB dbProd;
	
	public List<Prodotto> getCarrello(int id) {
		
		return new ArrayList<>(); 
		
	}
	
	public String addCarrello(int idUtente, int idProdotto){
		
		Prodotto p = dbProd.getById(idProdotto);
		List<Prodotto> carrello = getCarrello(idUtente);
		carrello.add(p);
		
		//getCarrello(idUtente).add(dbProd.getById(idProdotto));
		
		return "Prodotto aggiunto al carrello";
		
	}
	
	public String removeCarrello(int idUtente, int idProdotto) {
		
		Prodotto p = dbProd.getById(idProdotto);
		List<Prodotto> carrello = getCarrello(idUtente);
		carrello.remove(p);
		
		return "Prodotto rimossso";
	}
	
	
}
