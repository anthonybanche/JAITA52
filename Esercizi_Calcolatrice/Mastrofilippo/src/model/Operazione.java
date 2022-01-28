package model;


public abstract class Operazione implements Calcolo {
	
	protected double op1;
	protected double op2;
	
	public Operazione(double op1, double op2) {
		super();
		this.op1 = op1;
		this.op2 = op2;
		
	}

	@Override 
	public double operazione() {
		
		return 0;
	}
	
	
	
	
}	
