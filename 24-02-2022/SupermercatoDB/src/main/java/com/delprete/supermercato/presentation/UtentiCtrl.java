package com.delprete.supermercato.presentation;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.delprete.supermercato.model.Utente;
import com.delprete.supermercato.service.UtentiService;



@Controller
@RequestMapping("/login")
public class UtentiCtrl {
	
	@Autowired 
	UtentiService srv;
	
	@GetMapping
	public String get(Model model) {
		
		String titolo = "Inserisci le credenziali";
		
		model.addAttribute("formUtente", new Utente());
		//Siccome useremo un oggetto per il controllo, dobbiamo istanziarlo di principio
		model.addAttribute("titolo", titolo);
		
		return "login"; 
	}
	
	
	@PostMapping("/login-utente") 
	public String loginUtente(@ModelAttribute Utente utenteForm, Model model, HttpSession session) {
		
		System.out.println("utente form: " + utenteForm); // vedi consolese
		
		try {		
			Utente utente = srv.login(utenteForm); // restituisce utente se esiste, altrim lancia eccezione
			
			session.setAttribute("utente", utente); // aggiungo l'istanza dell'utente loggato alla sessione
			
			return "redirect:/lista-prodotti";			
			//return redirect consente di richiamare una rotta mappata all'interno di un controller
			//In questo caso chiediamo di dirigerci nella get mappata sotto lista-prodotti
			
		} catch(Exception e) {
			model.addAttribute("errore", e.getMessage());
			return get(model);
		}
	}

	@GetMapping("/logout") //N.B: url è  "/login/logout"
	public String logout(HttpSession session) {
		
		session.invalidate(); // resetta la sessione e gli oggetti associati
		
		return "redirect:/lista-prodotti";
	}
}
