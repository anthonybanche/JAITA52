package controller;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import exceptions.CalcolatriceException;
import exceptions.CalcolatriceSecEZException;
import model.Addizione;
import model.Divisione;
import model.Moltiplicazione;
import model.Operazione;
import model.Sottrazione;

public class CalcolatriceCtrl {
	
	private List <String> operazioni;
	private static int counter = 1;
	NumberFormat nf = new DecimalFormat("#0.00");
	
	public CalcolatriceCtrl() {
		this.operazioni = new ArrayList<>();
	}
	
	public String esecuzione(String choose, double x, double y) throws CalcolatriceException, CalcolatriceSecEZException{
		
		Operazione operation = null;
		double result = 0;
		String risultato = "";
		
		switch(choose.toLowerCase().trim()) {
		
		case "+":
		case "addizione":
			operation = new Addizione(x, y);
			result = ((Addizione) operation).eseguiOperazione();
			risultato = nf.format(result);
			if (y >= 0) operazioni.add(counter++ + ") " + x + " + " + y + " = " + risultato);
			else operazioni.add(counter++ + ") " + x + " + (" + y + ") = " + risultato);
			break;
			
		case "-":
		case "sottrazione":
			operation = new Sottrazione(x, y);
			result = ((Sottrazione) operation).eseguiOperazione();
			risultato = nf.format(result);
			if (y >= 0) operazioni.add(counter++ + ") " + x + " - " + y + " = " + risultato);
			else operazioni.add(counter++ + ") " + x + " - (" + y + ") = " + risultato);
			break;
			
		case "*":	
		case "moltiplicazione":
			operation = new Moltiplicazione(x, y);
			result = ((Moltiplicazione) operation).eseguiOperazione();
			risultato = nf.format(result);
			if (y >= 0) operazioni.add(counter++ + ") " + x + " * " + y + " = " + risultato);
			else operazioni.add(counter++ + ") " + x + " * (" + y + ") = " + risultato);
			break;
			
		case "/":	
		case "divisione":
			if(y == 0) throw new CalcolatriceSecEZException();
			operation = new Divisione(x, y);
			result = ((Divisione) operation).eseguiOperazione();
			risultato = nf.format(result);
			if (y > 0) operazioni.add(counter++ + ") " + x + " / " + y + " = " + risultato);
			else operazioni.add(counter++ + ") " + x + " / (" + y + ") = " + risultato);
			break;
			
		default:
			throw new CalcolatriceException();
		}

		return risultato;
	}
	
	public List<String> getListaOperazioni(){
		return operazioni;
	}
}
