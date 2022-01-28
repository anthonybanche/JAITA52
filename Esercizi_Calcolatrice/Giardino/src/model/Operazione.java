package model;

public abstract class Operazione implements Calcolo {
	double num1;
	double num2;

	public Operazione(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

}