package model;

public class Moltiplicazione extends Valori implements Calcolo {

	public Moltiplicazione(double op1, double op2) {
		super(op1, op2);

	}

	public double faiCalcolo() {
		return (op1 * op2);
	}
}
