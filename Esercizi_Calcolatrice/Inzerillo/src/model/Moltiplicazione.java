package model;

public class Moltiplicazione extends Operation{
	
	Moltiplicazione(){
		this.operationSign = "x";
	}

	@Override
	protected double doOperation() {
		return this.a*this.b;
	}
}
