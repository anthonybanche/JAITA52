package com.maboglia.canzoni.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maboglia.canzoni.model.Canzone;
import com.maboglia.canzoni.repository.Database;

@Service
public class CanzoniService {

	@Autowired
	Database db;
	
	public List<Canzone> getAll(){
		return db.getAll();
	}
	
	public Canzone getOne(int id){
		return db.getById(id);
	}
	
	public void salvaModifiche(Canzone newCanzone, boolean isUpdate) {
		if(!isUpdate) {
			db.addCanzone(newCanzone);
		}else {
			db.saveById(newCanzone);
		}
	}
	
	
}
