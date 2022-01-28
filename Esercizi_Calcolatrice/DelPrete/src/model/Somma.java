package model;

public class Somma extends Operazione implements Calcolo {

	public Somma(double operando1, double operando2) {
		super(operando1, operando2, '+');

		this.operando1 = operando1;
		this.operando2 = operando2;
	}

	public Somma() {
		super(0, 0, '+');
	}

	@Override
	public double operazione() {
		return super.getOperando1() + super.getOperando2();
	}

	@Override
	public String toString() {
		return "Somma : " + super.getOperando1() + " " + super.getOperatore() + "  " + super.getOperando2() + " = "
				+ this.operazione();
	}
}
