package com.maboglia.canzoni.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.maboglia.canzoni.repository.Database;
import com.maboglia.canzoni.service.CanzoniService;
import com.maboglia.canzoni.model.Canzone;

@Controller
@RequestMapping("canzoni")
public class CanzoniMVC {
	
	@Autowired
	CanzoniService srv;

	
	@GetMapping
	public String getAll(Model m) {
		String titolo_bello = "Le mie canzoni preferite";
		m.addAttribute("titolo", titolo_bello);
		
		m.addAttribute("canzoni",srv.getAll());
		m.addAttribute("newCanzone",new Canzone());
		m.addAttribute("isUpdate", false);
		
		return "elenco";
	}
	
	@GetMapping("/prova")
	public String getAll2() {
		return "prova";
	}
	
	@PostMapping("/saveCanzone")
	public String salvaModifica(
			@RequestParam(value="isUpdate", required=true) boolean isUpdate,
			@ModelAttribute Canzone newCanzone, 
			Model model) {

		
		srv.salvaModifiche(newCanzone, isUpdate);
		return getAll(model);
		
	}
	
	@PostMapping("/editCanzone")
	public String sceltaModifica(
			Model model,
			@RequestParam(value="idDaModificare", required=true) int idDaModificare) {
		
		
		Canzone daModificare=srv.getOne(idDaModificare);
		model.addAttribute("newCanzone",daModificare);
		model.addAttribute("isUpdate", true);
		return "elenco";
		
	}
		
}
