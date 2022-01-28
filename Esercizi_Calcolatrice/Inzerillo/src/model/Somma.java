package model;

public class Somma extends Operation{
	
	Somma(){
		this.operationSign = "+";
	}

	@Override
	protected double doOperation() {
		return this.a+this.b;
	}
}
