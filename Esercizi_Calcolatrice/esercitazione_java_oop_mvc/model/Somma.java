package model;

public class Somma extends Operazione implements Calcolo {
	
	public Somma(double op1, double op2) {
		super();
		this.op1 = op1;
		this.op2 = op2;
	}

	@Override
	public  double esOper() {
		return (op1 + op2);
		
	}
	
}