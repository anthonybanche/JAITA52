package model;

public class Sottrazione extends Operation{

	Sottrazione(){
		this.operationSign = "-";
	}
	
	@Override
	protected double doOperation() {
		return this.a-this.b;
	}

}
