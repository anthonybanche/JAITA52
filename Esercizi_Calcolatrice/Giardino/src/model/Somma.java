package model;

public class Somma extends Operazione {

	public Somma(double num1, double num2) {
		super(num1, num2);

	}

	@Override
	public void operazioni() {
		double somma = num1 + num2;

		System.out.println(somma);

	}

}
