package com.delprete.supermercato.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name ="prodotto") // -> se non lo mettiamo fa la tabella con il nome della classe
public class Prodotto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
	private String reparto;
	private double prezzo;
	@OneToMany(mappedBy = "prodotto")
	private List <Carrello> list;
	
	public Prodotto() {
		super();
	}

	public Prodotto(String nome, String reparto, double prezzo) {
		super();
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
