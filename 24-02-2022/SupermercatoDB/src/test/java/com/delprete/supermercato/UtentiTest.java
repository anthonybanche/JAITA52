package com.delprete.supermercato;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.delprete.supermercato.model.Prodotto;
import com.delprete.supermercato.model.Utente;
import com.delprete.supermercato.repository.ProdottiDB;
import com.delprete.supermercato.repository.UtentiDB;
import com.delprete.supermercato.service.UtentiService;


import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
@SpringBootTest
class UtentiTest {
	
	@Autowired
	UtentiDB db;
	@Autowired
	UtentiService utSrv;

	@Test
	void contextLoads() {
	}
	@Test
	void testRegistrazione() {
		
		Utente addUtente=new Utente("Pippo", "Pluto", "Via Reale 1", "a@db.d", "123456");
				
		long utentiCorrenti=db.count();
		utSrv.registraUtente(addUtente);
		
		assertEquals(utentiCorrenti+1, db.count());
		
		db.delete(addUtente);
		
	}
	
	@Test
	void findByEmail() {
		//List<Utente> list = db.findAll();
		Utente u=db.findByEmail("poverogabbiano@gmail.com");
		assertNotNull(u);
	}
}
