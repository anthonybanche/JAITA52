package model;

public class Divisione extends Operazione implements Calcolo{
	
	public Divisione(double opera1,double opera2) {
		this.opera1= opera1;
		this.opera2=opera2;
	}
	@Override
	public double FaiOperazione() {
		double divisione= opera1 / opera2;
		return divisione;
		
	}

}
