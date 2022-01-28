package model;

public class Sottrazione extends Operazione implements Calcolo {

	public Sottrazione(double op1,double op2) {
		super();
	}
	@Override
	public double FaiOperazione() {
		double sottrazione= opera1 - opera2;
		return sottrazione;
		
	}

}
