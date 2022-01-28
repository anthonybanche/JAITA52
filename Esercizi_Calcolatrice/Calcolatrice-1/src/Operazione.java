package model;

public class Operazione {
	double operatore1;
	double operatore2;
	
	public Operazione(double operatore1, double operatore2) {
		super();
		this.operatore1 = operatore1;
		this.operatore2 = operatore2;
	}

	public double getOperatore1() {
		return operatore1;
	}

	public void setOperatore1(double operatore1) {
		this.operatore1=operatore1;
      
	}

	public double getOperatore2() {
		return operatore2;
	}

	public void setOperatore2(double operatore2) {
		this.operatore2 = operatore2;
	}
	
}
