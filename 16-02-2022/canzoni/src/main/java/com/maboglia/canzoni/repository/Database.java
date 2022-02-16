package com.maboglia.canzoni.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.maboglia.canzoni.model.Canzone;

@Repository
public class Database {

List<Canzone> lista;

	public Database() {
		super();
		lista = new ArrayList(Arrays.asList(
				new Canzone(1, "brividi", "blanco", "blanco"),
				new Canzone(2, "ancora tu", "a", "b"),
				new Canzone(3, "soldi", "c", "d"),
				new Canzone(4, "ti stringerò", "e", "f")
				));
	}
	
	public List<Canzone> getAll(){
		return lista;
	}
	
	public void addCanzone(Canzone c) {
		lista.add(c);
	}
	
	public Canzone getById(int id) {
		for(Canzone c:lista) {
			if(id==c.getId()) {
				return c;
			}
		}
		return null;
	}
	
	public void saveById(Canzone c) {
		Canzone vecchia=getById(c.getId());
		lista.remove(vecchia);
		lista.add(c);
	}

}
