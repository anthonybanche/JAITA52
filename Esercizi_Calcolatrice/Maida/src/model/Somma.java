package model;

public class Somma extends Operazione implements Calcolo{

	double risultato;
	
	public Somma(double operatore1, double operatore2) {
		super(operatore1, operatore2);
	}

	@Override
	public double getRisultato() {
		risultato = operatore1 + operatore2;
		return risultato;
	}

	@Override
	public String toString() {
		return "Somma = " + risultato;
	}

	
	

}
