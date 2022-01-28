package model;

public class Somma extends Operazione implements Calcolo{
	
	private double op1;
	private double op2;
	
	public Somma(double op1, double op2) {
		super(op2, op2);
		this.op1 = op1;
		this.op2 = op2;
	}

	@Override
	public double faiOperazione() {
	return op1+op2;	
	}
	
}
