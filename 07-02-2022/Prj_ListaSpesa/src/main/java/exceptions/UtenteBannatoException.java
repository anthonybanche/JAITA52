package exceptions;

public class UtenteBannatoException extends Exception{
	
	public UtenteBannatoException(String utente) {
		super(utente + "è bannato e non può acquistare qui.");
	}

}
