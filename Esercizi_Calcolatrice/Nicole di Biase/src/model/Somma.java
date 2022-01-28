package model;

public class Somma extends Operazione{
	
	public Somma(int num1,int num2) {
		super(num1,num2);
	}

	@Override
	public int calcolo() {
		int somma=0;
		somma=(num1)+(num2);
		return somma;
	}
}
