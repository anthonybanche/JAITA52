package model;

public class Sottrazione extends Operazione{
	
	public Sottrazione(double op1, double op2) {
		super(op1, op2);
		
		
	}

	@Override
	public double operazione() {
		
		return op1 - op2;
	}

}
