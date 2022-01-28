package model;

public class Somma extends Operazione implements Calcolo  {
	
	public Somma(double operatore1, double operatore2) {
		super(operatore1, operatore2);

	}

	public double operazioni() {
		return operatore1 + operatore2;
	}

}
