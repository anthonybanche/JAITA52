package com.nicassio.canzoni.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nicassio.canzoni.model.Utente;

@Repository
public interface UtentiDB extends JpaRepository<Utente, Integer>{
	
	
}

