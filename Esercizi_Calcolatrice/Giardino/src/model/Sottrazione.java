package model;

public class Sottrazione extends Operazione {

	public Sottrazione(double num1, double num2) {
		super(num1, num2);

	}

	@Override
	public void operazioni() {
		double sottrazione = num1 - num2;
		System.out.println(sottrazione);

	}

}
