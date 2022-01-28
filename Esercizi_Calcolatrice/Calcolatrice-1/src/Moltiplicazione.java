package model;

public class Moltiplicazione extends Operazione implements Calcolo  {
	
	public Moltiplicazione(double operatore1, double operatore2) {
		super(operatore1, operatore2);

	}

	public double operazioni() {
		return operatore1 * operatore2;
	}

}
