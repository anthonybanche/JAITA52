package model;

public class Somma extends Operazione implements Calcolo{

	public Somma(double opera1,double opera2) {
		this.opera1= opera1;
		this.opera2=opera2;
	}

	@Override
	public double FaiOperazione() {
		double addizione= opera1 +opera2;
		return addizione;
		
	}
	
	
	
}
