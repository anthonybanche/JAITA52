package model;

public class Divisione extends Operazione implements Calcolo{
	
	double op1;
	double op2;
	



	public Divisione(double op1, double op2) {
		super(op2, op2);
		this.op1 = op1;
		this.op2 = op2;
	}


	@Override
	public double faiOperazione() {
return op1/op2;
		
	}
	
}