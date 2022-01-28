package it.model;

public class Moltiplicazione extends Operazione implements Calcolo {
	
	
	
	public Moltiplicazione(float op1, float op2) {
		super(op1, op2);
	}

	public float calcolo() {
		risultato = op1*op2;
		return risultato;
	}

}
