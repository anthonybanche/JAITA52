package model;

public class Somma extends Valori implements Calcolo {

	public Somma(double op1, double op2) {
		super(op1, op2);
	}

	public double faiCalcolo() {
		double risultato = (op1 + op2);

		return risultato;

	}

}
