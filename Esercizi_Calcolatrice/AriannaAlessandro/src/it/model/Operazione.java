package it.model;

public abstract class Operazione implements Calcolo{
	
	float op1;
	float op2;
	float risultato;
	
	public Operazione(float op1, float op2) {
		this.op1=op1;
		this.op2=op2;
	}
}
