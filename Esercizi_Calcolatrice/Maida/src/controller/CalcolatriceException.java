package controller;

public class CalcolatriceException extends Exception {

	int operatore;
	
	public CalcolatriceException() {
		super("Impossibile dividere per 0");
	}
	
	
	
	
}
