package model;

public class Divisione extends Operation{
	
	Divisione(){
		this.operationSign = "/";
	}

	@Override
	protected double doOperation() throws CalcolatriceException {
		if(this.a == 0 && this.b == 0)
			throw new CalcolatriceException("Undefined operation 0/0");
		return this.a/this.b;
	}
}
