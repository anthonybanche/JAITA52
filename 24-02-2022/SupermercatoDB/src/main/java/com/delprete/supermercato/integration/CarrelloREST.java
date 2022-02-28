package com.delprete.supermercato.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.delprete.supermercato.model.Prodotto;
import com.delprete.supermercato.model.Utente;
import com.delprete.supermercato.service.CarrelloService;

@RestController
@RequestMapping("/api")
@SessionAttributes("utente")
public class CarrelloREST {

	@Autowired
	CarrelloService srv;
	
	@GetMapping("/carrello")
	public List<Prodotto> getAll(Model m , Utente u) {
		
		List<Prodotto> carrello = srv.getCarrello(u.getId());
		return carrello;
		
	}
	
	@PostMapping("/aggiungiProdotto")
	public String addProdotto(@RequestParam int id , Utente u) {
		
		return srv.addCarrello(u.getId(), id);
	}
	
	@DeleteMapping("/rimuoviProdotto")
	public String deleteProdotto(@RequestParam int id , Utente u) {
		
		return srv.removeCarrello(u.getId(), id);
	}
	
//	@PostMapping("/saveCanzone")
//	public String salvaModifica (@RequestParam(value = "isUpdate", required = true) boolean isUpdate, 
//								 @RequestBody Utente newCanzone
//			){
//		
//		
//		if(srv.salvaModifica(newCanzone, isUpdate)) return "Salvataggio effettuato";
//		else return "Errore nel passaggio della richiesta";
//
//		
//	}
//	
//	@DeleteMapping("/deleteCanzone")
//	public String deleteCanzone (@RequestParam(value = "id", required = true) int id) {
//		
//		if(srv.deleteCanzone(id)) return "Cancellazione effettuata";
//		else return "Errore durante la cancellazione";
//		
//	}
//	
//	public Utente getCanzone (@PathVariable(value = "id") int id) {
//		
//	return srv.getOne(id);
//	}
//	
	
	
	
}
