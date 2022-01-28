package model;

public class Moltiplicazione extends Operazione implements Calcolo{

	double risultato;
	
	public Moltiplicazione(double operatore1, double operatore2) {
		super(operatore1, operatore2);
	}

	@Override
	public double getRisultato() {
		
		risultato = operatore1 *  operatore2;
		return risultato;
	}

	@Override
	public String toString() {
		return "Moltiplicazione = " + risultato ;
	}

}
