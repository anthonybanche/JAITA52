package com.maboglia.canzoni.integration;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maboglia.canzoni.model.Canzone;
import com.maboglia.canzoni.service.CanzoniService;

@RestController
@RequestMapping("api/canzoni")
public class CanzoniREST {
	
	@Autowired
	CanzoniService srv;
	
	@GetMapping
	public List<Canzone> getAll() {
		
		List<Canzone> canzoni = srv.getAll();
		
		return canzoni;
	}
	
	
	
	

}
