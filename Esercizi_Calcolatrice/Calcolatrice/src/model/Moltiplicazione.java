package model;

public class Moltiplicazione extends Operazione implements Calcolo  {
	
	public Moltiplicazione(double op1, double op2) {
		super(op1, op2);

	}

	@Override
	public double faiOperazione() {
		
		return op1*op2;
	}


	}


