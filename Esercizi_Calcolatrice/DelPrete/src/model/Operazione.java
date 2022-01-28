package model;

public class Operazione {

	double operando1;
	double operando2;
	char operatore;

	public Operazione(double operando1, double operando2, char operatore) {
		super();
		this.operando1 = operando1;
		this.operando2 = operando2;
		this.operatore = operatore;
	}

	public double getOperando1() {
		return operando1;
	}

	public void setOperando1(double operando1) {
		this.operando1 = operando1;
	}

	public double getOperando2() {
		return operando2;
	}

	public void setOperando2(double operando2) {
		this.operando2 = operando2;
	}

	public char getOperatore() {
		return operatore;
	}

	public void setOperatore(char operatore) {
		this.operatore = operatore;
	}

}
