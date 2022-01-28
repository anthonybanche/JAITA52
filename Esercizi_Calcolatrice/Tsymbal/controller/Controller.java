package controller;

import model.CalcolatriceException;
import model.Divisione;
import model.Moltiplicazione;
import model.Somma;
import model.Sottrazione;

public class Controller {

	public Controller(){
		
	}
		
	public void Calcolo(double op1,double op2,String op) throws CalcolatriceException {
	

		
	switch(op) {
	case "+": 
		Somma risultato = new Somma(op1,op2);
		System.out.println(risultato.faiOperazione());
		break;
	case "-":
		Sottrazione risultato1 = new Sottrazione(op1,op2);
		System.out.println(risultato1.faiOperazione());
		break;
	case "*":
		Moltiplicazione risultato2 = new Moltiplicazione(op1,op2);
		System.out.println(risultato2.faiOperazione());
		break;
	case "/":
		Divisione risultato3 = new Divisione(op1,op2);
		System.out.println(risultato3.faiOperazione());
		break;
	default:
		System.out.println("Sono accettati solo i simboli: +, -, *, /");
		throw new CalcolatriceException(op);
		}
	}
	
	
}
