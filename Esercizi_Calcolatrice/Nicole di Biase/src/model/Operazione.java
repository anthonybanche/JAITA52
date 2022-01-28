package model;

public abstract class Operazione implements Calcolo{
	int num1;
	int num2;

	public Operazione(int num1, int num2) {
		this.num1=num1;
		this.num2=num2;
	}

}