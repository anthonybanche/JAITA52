package model;

public class Moltiplicazione extends Operazione {
	
	public Moltiplicazione(double op1, double op2) {
		super(op1, op2);
		
		
	}

	@Override
	public double operazione() {
		
		return op1 * op2;
	}

}
