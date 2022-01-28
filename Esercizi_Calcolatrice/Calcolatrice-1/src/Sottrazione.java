package model;

public class Sottrazione extends Operazione implements Calcolo  {
	
	public Sottrazione(double operatore1, double operatore2) {
		super(operatore1, operatore2);

	}

	public double operazioni() {
		return operatore1 - operatore2;
	}

}
