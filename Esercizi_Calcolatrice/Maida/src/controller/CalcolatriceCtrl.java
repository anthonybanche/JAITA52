package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Divisione;
import model.Moltiplicazione;
import model.Operazione;
import model.Somma;
import model.Sottrazione;

public class CalcolatriceCtrl {

	Scanner scan = new Scanner(System.in);
	
	Somma somma;
	Divisione div;
	Moltiplicazione molt;
	Sottrazione sot;
	List<String> operazioni = new ArrayList<>();
	
	public Somma calcoloSomma(double oper1, double oper2) {
		somma = new Somma(oper1, oper2);
		somma.getRisultato();
		String somma1 = somma.toString();
		operazioni.add("Effettuata somma: " + somma1);
		return somma;
	}
	
	public void stampaSomma() {
		System.out.println(somma);
	}
	
	
	public Divisione calcoloDivisione(double oper1, double oper2) throws CalcolatriceException {
		div = new Divisione(oper1, oper2);
		if(oper2 == 0) {
			throw new CalcolatriceException();
		}
		div.getRisultato();
		String div1 =  div.toString();
		operazioni.add(div1);
		return div;
	}
	
	public void stampaDivisione() {
		System.out.println(div);
	}
	
	public void aggiungiDivisione() {
	
	}

	public Moltiplicazione calcoloMoltiplicazione(double oper1, double oper2) {
		molt = new Moltiplicazione(oper1, oper2);
		molt.getRisultato();
		String molt1 = molt.toString();
		operazioni.add(molt1);
		return molt;
	}
	
	public void stampaMoltiplicazione() {
		System.out.println(molt);
	}
	
	public void aggiungiMoltiplicazione() {
		
	}

	public Sottrazione calcoloSottrazione(double oper1, double oper2) {
		sot = new Sottrazione(oper1, oper2);
		sot.getRisultato();
		String sot1 = sot.toString();
		operazioni.add(sot1);
		return sot;
	}
	
	public void stampaSottrazione() {
		System.out.println(sot);
	}
	
	public void aggiungiSottrazione() {
		;
	}
	
	public List<String> getOperazioni() {
		return operazioni;
	}
	

}
