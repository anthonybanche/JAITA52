package model;


	public class Sottrazione extends Operazione implements Calcolo  {
	 public Sottrazione(double op1, double op2) {
			super(op1, op2);
					}

	@Override
	public double faiOperazione() {
		
		return op1-op2;
	}
	
	}

