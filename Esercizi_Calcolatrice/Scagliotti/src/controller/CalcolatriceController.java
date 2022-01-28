package controller;


import java.util.List;
import java.util.Scanner;

import model.CalcolatriceException;
import model.Divisione;
import model.Moltiplicazione;
import model.Somma;
import model.Sottrazione;

public class CalcolatriceController {
	 
	static Scanner sc= new Scanner(System.in);
	static double risultato;
	public static double controlloOperazione(double operatore1,double operatore2, String operazione ) throws CalcolatriceException {
		switch (operazione) {
		case "+": 
					try {
					Somma r= new Somma(operatore1, operatore2);
					risultato=r.getCalcolo();
					}
					catch (Exception e) {
						System.out.println("Somma non riuscita");
					}
					break;
		case "-": 		
			try {
				Sottrazione r= new Sottrazione(operatore1, operatore2);
				risultato=r.getCalcolo();
				}
				catch (Exception e) {
					System.out.println("Sottrazione non riuscita");
				}
				break;
		case "*": 		
			try {
				Moltiplicazione r= new Moltiplicazione(operatore1, operatore2);
				risultato=r.getCalcolo();
				}
				catch (Exception e) {
					System.out.println("Moltiplicazione non riuscita");
				}
				break;
		case "/": 		
			try {
				Divisione r= new Divisione(operatore1, operatore2);
				risultato=r.getCalcolo();
				}
				catch (CalcolatriceException e) {  
					
					System.out.println(e.getMessage());
				}
				break;
				
		default:
			throw new IllegalArgumentException("Unexpected value: " + operazione);
		}
		return risultato;
	}
	
	public static String leggiOperazione() {
		System.out.println("Inserisci l'operazione che vuoi fare: (+, -, *, /) "
							+ "\nInserisci stringa vuota per terminare");
		String operazione=sc.nextLine();
		if(operazione.equals("")){
			return "fine";
		}else
		if( !operazione.equals("+")  && !operazione.equals("-")  && !operazione.equals("*") && !operazione.equals("/") )
		{
				
			  System.out.println("Non hai inserito una operazione, riprova:");
			  operazione=sc.nextLine();
			  return operazione;
		}
		else { return operazione;}
	}
}
