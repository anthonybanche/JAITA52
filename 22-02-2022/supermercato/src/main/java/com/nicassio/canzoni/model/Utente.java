package com.nicassio.canzoni.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.context.annotation.Scope;

@Entity // -> Lo stereotipo entity identifica le classi che rappresentano delle tabelle di database
@Table(name = "utente") //  -> E' il nome della tabella che viene collegata a questa classe
@Scope("session")
public class Utente {
	
	@Id // -> Serve per dire che il campo id è la chiave primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY) // -> Serve per dire che è AUTO INCREMENT
	private int id;

	@Column(name="name") // -> Serve per impostare il nome corrispondente al campo sul database
	private String nome;

	private String cognome;
	private String indirizzo;
	private String email;
	private String password;

	@Transient // -> Serve per dire a spring data di ignorare questo campo
	private List<Prodotto> carrello;
	
	public Utente() {}

	public Utente(int id, String nome, String cognome, String indirizzo, String email, String password) {
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.indirizzo = indirizzo;
		this.email = email;
		this.password = password;
		this.carrello = new ArrayList<>();
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

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public List<Prodotto> getCarrello() {
		return carrello;
	}

	public void setCarrello(List<Prodotto> carrello) {
		this.carrello = carrello;
	}

	@Override
	public String toString() {
		return "Utente [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", indirizzo=" + indirizzo + ", email="
				+ email + ", password=" + password + ", carrello=" + carrello + "]";
	}
	
}
