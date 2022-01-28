package model;

public class Moltiplicazione extends Calcolatrice implements Calcolo {
	
	double risultato;

	public Moltiplicazione(double operatore1, double operatore2) {
		super(operatore1, operatore2);
	}

	@Override
	public double operazione() {
		risultato = operatore1 * operatore2;
		return risultato;
	}
	

}
