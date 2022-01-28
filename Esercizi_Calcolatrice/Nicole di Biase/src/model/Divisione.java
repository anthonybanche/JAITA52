package model;

public class Divisione extends Operazione{
	public Divisione(int num1,int num2) {
		super(num1,num2);
	}

	@Override
	public int calcolo() {
		int divisione=(num1)/(num2);
		int resto=num1%num2;
		return divisione;
	}

}