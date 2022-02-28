package com.delprete.supermercato.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "carrello")
public class Carrello {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="utenteId", referencedColumnName = "id")
	@PrimaryKeyJoinColumn
	
	private Utente utente;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="prodottoId", referencedColumnName = "id")
	private Prodotto prodotto;
	
	public Carrello() {
	}
	
	public Carrello(Utente ut, Prodotto p) {
		
		this.utente = ut;
		this.prodotto = p;

	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Utente getUtente() {
		return utente;
	}
	public void setUtente(Utente utente) {
		this.utente = utente;
	}
	public Prodotto getProdotto() {
		return prodotto;
	}
	public void setProdotto(Prodotto prodotto) {
		this.prodotto = prodotto;
	}
	
}
