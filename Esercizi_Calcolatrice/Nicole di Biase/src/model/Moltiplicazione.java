package model;

public class Moltiplicazione extends Operazione{

	public Moltiplicazione(int num1, int num2) {
		super(num1, num2);
	}

	@Override
	public int calcolo() {
		int moltiplicazione=(num1)*(num2);
		return moltiplicazione;
	}

}