package com.nicassio.canzoni.model;

public class Prodotto {

	private int id;
	private String nome;
	private String reparto;
	private double prezzo;
	
	public Prodotto() {
		super();
	}

	public Prodotto(int id, String nome, String reparto, double prezzo) {
		super();
		this.id = id;
		this.nome = nome;
		this.reparto = reparto;
		this.prezzo = prezzo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getReparto() {
		return reparto;
	}

	public void setReparto(String reparto) {
		this.reparto = reparto;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	@Override
	public String toString() {
		return "Prodotto [id=" + id + ", nome=" + nome + ", reparto=" + reparto + ", prezzo=" + prezzo + "]";
	}
	
}
