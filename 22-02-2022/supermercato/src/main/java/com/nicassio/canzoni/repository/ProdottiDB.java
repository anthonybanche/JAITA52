package com.nicassio.canzoni.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.nicassio.canzoni.model.Prodotto;
import com.nicassio.canzoni.model.Utente;

@Repository
public class ProdottiDB {
	
	List<Prodotto> lista;
	
	public ProdottiDB() {
		lista = new ArrayList(
					Arrays.asList(
					new Prodotto(1, "Carota", "Verdura", 1.60),
					new Prodotto(2, "Banana", "Frutta", 2.50),
					new Prodotto(3, "Biscotti", "Dolci", 4.10),
					new Prodotto(4, "Formaggio Asiago", "Latticini", 3.15)
					
		));
	}
	
	public List<Prodotto> getAll(){
		return lista;
	}
	
	public void addProdotto(Prodotto c) {
		lista.add(c);
	}
	
	public Prodotto getById(int id) {
		for(Prodotto c:lista) {
			if(id==c.getId()) return c;
		}
		return null;
	}
	
	public void saveById(Prodotto c) {
		Prodotto vecchia = getById(c.getId());
		lista.remove(vecchia);
		lista.add(c);
	}
	
	public void deleteById(int id) {
		
		lista.remove(getById(id));
	}
}
