package controller;

public class calcException extends Exception {

	String messaggio;
	
	public calcException(String msg) {
		super(msg);
		messaggio = msg;
	}
	
	public String getMessaggio() {
		return messaggio;
	}
	
}
