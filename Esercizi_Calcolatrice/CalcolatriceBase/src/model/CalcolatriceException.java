package model;

public class CalcolatriceException extends Exception
{
	String messaggio;
	
	public CalcolatriceException(String msg) 
	{
		super(msg);
		messaggio = msg;
	}
	
	public String getMessaggio() 
	{
		return messaggio;
	}
}
