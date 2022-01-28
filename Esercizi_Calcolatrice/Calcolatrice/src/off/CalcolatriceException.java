package model;

public class CalcolatriceException extends Exception{
	
	private static final long serialVersionUID = 1L;
	String messaggio;

	public CalcolatriceException(String messaggio) {
		super();
		this.messaggio = messaggio;
	}

	public String getMessaggio() {
		return messaggio;
	}

	public void setMessaggio(String messaggio) {
		this.messaggio = messaggio;
	}


}
