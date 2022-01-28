package controller;

import java.util.ArrayList;
import java.util.List;

import model.Addizione;
import model.Calcolo;
import model.Divisione;
import model.Moltiplicazione;
import model.Sottrazione;

public class CalcolatriceCtrl {
	
	public static List<String> log = new ArrayList<>();

	public static void addAdd(double ope1, double ope2, double risultato) 
	{
		Calcolo c = new Addizione(ope1, ope2, risultato);
		risultato = Addizione.Risultato(ope1, ope2);
		System.out.println("Il risultato è: " + risultato);
		log.add(c.toString());
	}
	
	public static void addSub(double ope1, double ope2, double risultato) 
	{
		Calcolo c = new Sottrazione(ope1, ope2, risultato);
		risultato = Sottrazione.Risultato(ope1, ope2);
		System.out.println("Il risultato è: " + risultato);
		log.add(c.toString());

	}
	
	public static void addMul(double ope1, double ope2, double risultato) 
	{
		Calcolo c = new Moltiplicazione(ope1, ope2, risultato);
		risultato = Moltiplicazione.Risultato(ope1, ope2);
		System.out.println("Il risultato è: " + risultato);
		log.add(c.toString());

	}
	
	public static void addDiv(double ope1, double ope2, double risultato) 
	{
		Calcolo c = new Divisione(ope1, ope2, risultato);
		risultato = Divisione.Risultato(ope1, ope2);
		System.out.println("Il risultato è: " + risultato);
		log.add(c.toString());

	}
}
