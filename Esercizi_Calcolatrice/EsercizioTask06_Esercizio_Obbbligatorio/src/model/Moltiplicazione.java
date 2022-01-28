package model;

public class Moltiplicazione extends Operazione implements Calcolo{

	public Moltiplicazione(){
		operazioneDaFare="moltiplicazione";
	}
	
	@Override
	public double calcolo(double operatore1, double operatore2) {
		this.operatore1=operatore1;
		this.operatore2=operatore2;
		
		risultato = (operatore1 * operatore2);
		return risultato;
	}
}
