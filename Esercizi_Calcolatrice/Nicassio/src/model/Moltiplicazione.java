package model;

public class Moltiplicazione extends Operazione{

	public Moltiplicazione(double operando1, double operando2) {
		super(operando1, operando2);
	}

	@Override
	public double eseguiOperazione() {
		return (this.operando1 * this.operando2);
		}

}
