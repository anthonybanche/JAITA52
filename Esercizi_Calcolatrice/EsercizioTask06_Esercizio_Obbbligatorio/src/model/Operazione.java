package model;

public class Operazione {
	
	//Attributi
	protected double operatore1;
	protected double operatore2;
	protected String operazioneDaFare;
	protected int contatore;
	protected double risultato;
	
	public Operazione() {
	}
	
	//GETTERS
	public double getOperatore1() {
		return operatore1;
	}

	public double getOperatore2() {
		return operatore2;
	}
	
	public String getOperazioneDaFare() {
		return operazioneDaFare;
	}
	
	public int getContatore() {
		return contatore;
	}

	public double getRisultato() {
		return risultato;
	}

	//SETTERS
	public void setContatore(int contatore) {
		this.contatore += contatore;
	}
	
	public void setOperatore1(double operatore1) {
		this.operatore1 = operatore1;
	}

	public void setOperatore2(double operatore2) {
		this.operatore2 = operatore2;
	}

	public void setRisultato(double risultato) {
		this.risultato = risultato;
	}

	public void setOperazioneDaFare(String operazioneDaFare) {
		this.operazioneDaFare = operazioneDaFare;
	}

	public String getReport(){
		return "Operazione " + contatore + " e' stata : " + operatore1 + " " + operazioneDaFare + " " + operatore2 + " = " + risultato;
	}

	
}