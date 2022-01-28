package model;

public class Divisione extends Operazione implements Calcolo {

	public Divisione(double op1, double op2) {
		super(op1, op2);

	}

	@Override
	public double faiOperazione() {
		
		return (op1 / op2);
	}




}


