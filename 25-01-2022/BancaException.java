
public class BancaException extends Exception {
	
	String messaggio;
	
	public BancaException(String msg) {
		super(msg);
		messaggio = msg;
	}
	
	public String getMessaggio() {
		return messaggio;
	}
	
}
