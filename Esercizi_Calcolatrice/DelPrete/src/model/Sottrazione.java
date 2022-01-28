package model;

public class Sottrazione extends Operazione implements Calcolo {

	public Sottrazione(double operando1, double operando2) {
		super(operando1, operando2, '-');

		this.operando1 = operando1;
		this.operando2 = operando2;
	}

	public Sottrazione() {
		super(0, 0, '-');
	}

	@Override
	public double operazione() {
		return super.getOperando1() - super.getOperando2();
	}

	public String toString() {
		return "Sottrazione : " + super.getOperando1() + " " + super.getOperatore() + "  " + super.getOperando2()
				+ " = " + this.operazione();
	}

}
