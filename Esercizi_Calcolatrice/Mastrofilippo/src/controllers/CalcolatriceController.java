package controllers;

import model.Divisione;
import model.Moltiplicazione;
import model.Operazione;
import model.Somma;
import model.Sottrazione;

public class CalcolatriceController {
	public Operazione istanzaOperazione;
	
	public double op1;
	public double op2;
	
	public CalcolatriceController(double op1, double op2, String op) {
		super();
		this.op1 = op1;
		this.op2 = op2;
		if (op.equals("+"))
			istanzaOperazione = new Somma(op1, op2);
		else if(op.equals("-"))
			istanzaOperazione= new Sottrazione(op1, op2);
		else if(op.equals("*"))
			istanzaOperazione= new Moltiplicazione(op1, op2);
		else if(op.equals("/"))
			istanzaOperazione= new Divisione(op1, op2);
		}
	
	public double eseguiOperazione() {
		return istanzaOperazione.operazione();
	}
	
	
}	
