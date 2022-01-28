package model;

public class Divisione extends Valori implements Calcolo{

	public Divisione(double op1, double op2) {
		super(op1, op2);
	}

	public double faiCalcolo() {

		return (op1 / op2);
	}
}
