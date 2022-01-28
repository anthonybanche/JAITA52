package model;

public class Divisione extends Operazione {

	public Divisione(double num1, double num2) {
		super(num1, num2);

	}

	@Override
	public void operazioni() {
		double divisione = num1 / num2;
		if (num2 == 0) {
			System.out.println("Errore: Non si può dividere per 0!");
		} else {
			System.out.println(divisione);

		}

	}
}