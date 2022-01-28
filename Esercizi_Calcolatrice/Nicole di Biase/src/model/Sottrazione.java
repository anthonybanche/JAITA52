package model;

public class Sottrazione extends Operazione{
	public Sottrazione(int num1,int num2) {
		super(num1,num2);
	}

	@Override
	public int calcolo() {
		int sottrazione;
		sottrazione=(num1)-(num2);
		return sottrazione;
	}

}
