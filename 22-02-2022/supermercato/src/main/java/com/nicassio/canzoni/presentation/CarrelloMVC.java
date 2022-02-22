package com.nicassio.canzoni.presentation;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.nicassio.canzoni.model.Utente;

@Controller
@RequestMapping("/carrello")
@SessionAttributes("utente")
public class CarrelloMVC {

	@GetMapping
	public String get(Utente utente, Model model) {
		if (utente.getEmail()==null) {
			return "redirect:/login";
		}return "carrello";
	}
	
	
	
}
