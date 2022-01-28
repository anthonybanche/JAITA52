package model;

public class Moltiplicazione extends Operazione implements Calcolo{
	public Moltiplicazione(double operatore1, double operatore2) {
		super(operatore1, operatore2);
		
	}

	@Override
	public double getCalcolo() {
		
		return operatore1*operatore2;
	}
}
