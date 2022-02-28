package com.delprete.supermercato.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.delprete.supermercato.model.Carrello;

@Repository
public interface CarrelloDB extends JpaRepository <Carrello, Integer> {
	
}
