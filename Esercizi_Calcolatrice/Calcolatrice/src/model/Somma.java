package model;

public class Somma extends Operazione implements Calcolo  {
	public Somma(double op1, double op2) {
		super(op1, op2);
	}


	public double faiOperazione() {

		return op1+op2;
	}
}
