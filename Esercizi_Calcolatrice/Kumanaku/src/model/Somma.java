package model;

public class Somma extends Calcolatrice implements Calcolo{
	
	double risS;
	
	public Somma(double operatore1, double operatore2) {
		super(operatore1, operatore2);
	}

	@Override
	public double operazione() {
		
		risS = operatore1 + operatore2;
		return risS;
	}
	
	

}
