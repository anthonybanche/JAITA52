package model;

public class Prodotto {
	
	private int id;
	private String nome;
	private double prezzo;
	private String categoria;
	
	public Prodotto(int id, String nome, double prezzo, String categoria) {
		this.id = id;
		this.nome = nome;
		this.prezzo = prezzo;
		this.categoria = categoria;
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

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

}
