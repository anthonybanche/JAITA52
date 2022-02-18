package com.maboglia.canzoni.model;

public class Canzone {

	private int id;
	private String titolo;
	private String autore;
	private String compositore;
	
	public Canzone() {
		// TODO Auto-generated constructor stub
	}

	public Canzone(int id, String titolo, String autore, String compositore) {
		super();
		this.id = id;
		this.titolo = titolo;
		this.autore = autore;
		this.compositore = compositore;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	@Override
	public String toString() {
		return "Canzone [id=" + id + ", titolo=" + titolo + "]";
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public String getCompositore() {
		return compositore;
	}

	public void setCompositore(String compositore) {
		this.compositore = compositore;
	}
	
	
	
	
}
