package model;

public class Sottrazione extends Operazione implements Calcolo{

	public Sottrazione(double operatore1, double operatore2) {
		super(operatore1, operatore2);
		
	}

	@Override
	public double getCalcolo() {
		
		return operatore1-operatore2;
	}
	

}

