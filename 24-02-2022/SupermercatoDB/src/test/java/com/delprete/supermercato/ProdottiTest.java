package com.delprete.supermercato;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.delprete.supermercato.model.Prodotto;
import com.delprete.supermercato.repository.ProdottiDB;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

@SpringBootTest
class ProdottiTest {
	
	@Autowired
	ProdottiDB db;
	

	@Test
	void contextLoads() {
	}
	
	@Test
	void loadProdotti() {
		db.deleteAll();
		db.save(new Prodotto("mela","frutta", 1.50));
		db.save(new Prodotto("pera","frutta", 1.10));
		db.save(new Prodotto("banana","frutta", 1.90));
		assertEquals(3, db.count());
	}
	
	@Test
	void updProdotto() {
	//List<Prodotto> lista = db.findAll();
	//System.out.println(lista);
		List<Prodotto> pr = db.findByNomeAndReparto("mela", "frutta");
		pr.get(0).setNome("melograno");
		db.save(pr.get(0));
		assertNotNull(db.findByNome("melograno").get(0));
	}
	
}
