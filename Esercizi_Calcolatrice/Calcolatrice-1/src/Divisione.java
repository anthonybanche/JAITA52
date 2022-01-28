package model;

public class Divisione extends Operazione implements Calcolo  {
	
	public Divisione(double operatore1, double operatore2) {
		super(operatore1, operatore2);

	}

	public double operazioni() {
		return operatore1 / operatore2;
	}

}
