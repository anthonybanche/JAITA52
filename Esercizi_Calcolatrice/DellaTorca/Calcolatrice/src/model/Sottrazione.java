package model;

public class Sottrazione extends Operazione implements Calcolo {
	
	public Sottrazione(double ope1, double ope2, double risultato) {
		super(ope1, ope2, risultato);
		risultato = ope1 + ope2;
	}
	
	public static double Risultato(double ope1, double ope2) {
		risultato = ope1 - ope2;
		return risultato;
	}
	
	@Override
	public String toString() {
		return (ope1 + " - " + ope2 + " = " + risultato)  ;
	}
}
