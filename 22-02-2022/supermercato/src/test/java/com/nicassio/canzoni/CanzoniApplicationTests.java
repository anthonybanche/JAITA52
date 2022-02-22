package com.nicassio.canzoni;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.nicassio.canzoni.model.Utente;
import com.nicassio.canzoni.repository.UtentiDB;
import com.nicassio.canzoni.service.UtentiService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CanzoniApplicationTests {
	@Autowired
	UtentiDB db;

	@Autowired
	UtentiService utentiSrv;

	@Test
	void contextLoads() {
	}

	@Test
	void loadUtenti(){
		
		db.deleteAll();
		db.save(new Utente("Tizio","Caio","Via Baddi, 5","a@dde.de","123123"));
		assertEquals(db.count(), 1);

	}

	@Test
	void testRegistrazione(){
		
		Utente utenteCheSiVuoleRegistrare=new Utente("Pippo", "Pluto", "Via Reale 1", "a@b.ddd", "456789");

		long utentiCorrenti=db.count();

		utentiSrv.registraUtente(utenteCheSiVuoleRegistrare);

		assertEquals(utentiCorrenti+1, db.count());

		db.delete(utenteCheSiVuoleRegistrare);

	}


}
