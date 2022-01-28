package model;

public class Moltiplicazione extends Operazione {

	public Moltiplicazione(double num1, double num2) {
		super(num1, num2);

	}

	@Override
	public void operazioni() {
		double moltiplicazione = num1 * num2;
		System.out.println(moltiplicazione);

	}

}
