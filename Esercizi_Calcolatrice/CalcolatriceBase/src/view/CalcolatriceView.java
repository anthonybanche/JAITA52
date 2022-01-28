package view;

import java.util.Scanner;

import model.Somma;
import model.CalcolatriceException;
import model.Differenza;
import model.Divisione;
import model.Moltiplicazione;

public class CalcolatriceView 
{

	public static void main(String[] args) 
	{
		
		Scanner s = new Scanner(System.in);
		boolean sentinell = false;
		
		while(!sentinell)
		{
			System.out.println("Inserisci primo numero: ");
			double op1 = s.nextDouble();
			s.nextLine();
			
			System.out.println("Inserisci secondo numero: ");
			double op2 = s.nextDouble();
			s.nextLine();
			
			System.out.println("Scegli l'operazione da eseguire, batti invio per uscire: ");
			String scelta = s.nextLine();
			
			switch(scelta)
			{
				case "somma":
					Somma risultato = new Somma(op1, op2);//chiamo la classe Somma 
					System.out.println(risultato.calcolami());
					break;
				case "differenza":
					Differenza risultato1 = new Differenza(op1,op2);
					System.out.println(risultato1.calcolami());
					break;
				case "prodotto":
					Moltiplicazione risultato2 = new Moltiplicazione(op1, op2);
					System.out.println(risultato2.calcolami());
					break;
				case "divisione":
					Divisione risultato3 = new Divisione(op1, op2);
					System.out.println(risultato3.calcolami());
					break;
				
				default:
					if(scelta.isEmpty())
				   {
					System.out.println("Arrivederci");
					sentinell = true;
				   }
				  else
				  {
					System.out.println("Scelta non valida!Scrivere l'operazione da eseguire in minuscolo");
					break;
				  }
		    }
			
		} 
	}

}
