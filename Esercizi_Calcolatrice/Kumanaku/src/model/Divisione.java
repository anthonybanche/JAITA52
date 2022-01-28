package model;

public class Divisione extends Calcolatrice implements Calcolo {
	
	double risultato;

	public Divisione(double operatore1, double operatore2) throws Exception {
		super(operatore1, operatore2);
		if(operatore2 == 0) {
			throw new Exception("Cannot divide by zero");
		}
	}

	@Override
	public double operazione(){
		
		risultato = operatore1 / operatore2;
		
		return risultato;
	}
	

}
