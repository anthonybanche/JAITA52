package com.delprete.supermercato.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.delprete.supermercato.model.Utente;

@Repository
public interface UtentiDB extends JpaRepository<Utente, Integer> {
	
	@Query(value= "select * from utente u where u.email = :email",nativeQuery=true)
	Utente findByEmail(@Param("email")String email);
	
}
