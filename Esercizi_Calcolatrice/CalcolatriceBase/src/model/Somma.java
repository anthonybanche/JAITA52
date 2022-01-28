package model;

public class Somma extends Operazione implements Calcolo
{
	private double num1;
	private double num2;
	
	public Somma(double num1, double num2) 
	{
		super(num1, num2);
		this.num1 = num1;
		this.num2 = num2;
	}

	@Override
	public double calcolami() //sovrascrive il metodo dell'interfaccia 
	{
		return num1 + num2;
	}

}

