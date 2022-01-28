package model;//in questo pacchetto ci sono tutte le operazioni, i getters and setters e l'interfaccia

//questa sarà una super classe 
public class Operazione 
{
     private double number1; 
     private double number2;
     
     public Operazione(double number1, double number2)
     {
    	 this.number1 = number1;
    	 this.number2 = number2;
     }
     
	public double getNumber1() 
	{
		return number1;
	}

	public void setNumber1(double number1) 
	{
		this.number1 = number1;
	}

	public double getNumber2() 
	{
		return number2;
	}

	public void setNumber2(double number2) 
	{
		this.number2 = number2;
	}
    
}//da questa classe tutte le altre classi prenderanno gli attributi
