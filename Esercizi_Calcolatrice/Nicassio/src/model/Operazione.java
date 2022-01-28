package model;

public abstract class Operazione implements OperazioneInter{
	
	double operando1;
	double operando2;
	
	public Operazione(double operando1, double operando2) {
		this.operando1 = operando1;
		this.operando2 = operando2;
	}
	
}
