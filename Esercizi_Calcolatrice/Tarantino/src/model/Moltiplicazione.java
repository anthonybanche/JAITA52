package model;

public class Moltiplicazione extends Operazione implements Calcolo {

	public Moltiplicazione(double opera1,double opera2) {
		this.opera1= opera1;
		this.opera2=opera2;
	}
	
	@Override
	public double FaiOperazione() {
		double moltiplicazione= opera1 * opera2;
		return moltiplicazione;
		
	}

}
