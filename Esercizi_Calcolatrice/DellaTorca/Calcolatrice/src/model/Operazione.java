package model;

public class Operazione implements Calcolo {
	
	public double ope1;
	public double ope2;
	public static double risultato;
	
	
	Operazione(double ope1, double ope2, double risultato) {
		this.ope1 = ope1;
		this.ope2 = ope2;
		this.risultato = risultato;
	}

	public double getRisultato() {
		return risultato;
	}

	public void setRisultato(double risultato) {
		this.risultato = risultato;
	}

	public double getOpe1() {
		return ope1;
	}

	public void setOpe1(double ope1) {
		this.ope1 = ope1;
	}

	public double getOpe2() {
		return ope2;
	}

	public void setOpe2(double ope2) {
		this.ope2 = ope2;
	}

}
