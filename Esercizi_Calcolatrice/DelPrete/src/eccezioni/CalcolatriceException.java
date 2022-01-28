package eccezioni;

public class CalcolatriceException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String messaggio;

	public CalcolatriceException(String msg) {
		super(msg);
		messaggio = msg;
	}

	public String getMessaggio() {
		return messaggio;
	}
}
