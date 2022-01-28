package model;

public class Divisione extends Operazione implements Calcolo{

	double risultato;
	
	public Divisione(double operatore1, double operatore2) {
		super(operatore1, operatore2);
		
	}
	
	

	public double getRisultato() {
		risultato = operatore1/operatore2;
		return (double) risultato;
	}

	@Override
	public String toString() {
		return "Divisione = " + risultato;
	}
}
