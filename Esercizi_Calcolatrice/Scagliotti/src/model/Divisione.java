package model;

public class Divisione extends Operazione implements Calcolo{
	public Divisione(double operatore1, double operatore2) {
		super(operatore1, operatore2);
		
	}

	@Override
	public double getCalcolo()  throws CalcolatriceException {
		if(operatore2==0) {
			throw new CalcolatriceException("Il secondo operatore non puo' essere nullo");
			
		}
		return operatore1/operatore2;
	
	}
}
