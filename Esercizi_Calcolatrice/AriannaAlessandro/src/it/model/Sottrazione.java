package it.model;

public class Sottrazione extends Operazione implements Calcolo {
	
	
	
	public Sottrazione(float op1, float op2) {
		super(op1, op2);
		
	}

	public float calcolo() {
		risultato = op1-op2;
		return risultato;
	}

}
