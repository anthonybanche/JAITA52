package control;

import java.util.Scanner;

import model.Divisione;
import model.Moltiplicazione;
import model.Somma;
import model.Sottrazione;

public class Control {
	public Control() {
		
	}
	public void calcolo() {
		Scanner sc=new Scanner(System.in);
		int n1;
		int n2;
		String operazione;
		do {
			System.out.println("Inserisci il primo numero: ");
			n1=sc.nextInt();
			sc.nextLine();
			System.out.println("Inserisci il secondo numero: ");
			n2=sc.nextInt();
			sc.nextLine();
			System.out.println("Inserisci l'operazione da eseguire: +, -, *, / ");
			operazione=sc.nextLine();
	
			switch(operazione)
			{
				case "+":
					System.out.println("Hai scelto addizione!");
					Somma add=new Somma(n1,n2);
					add.calcolo();
					break;
				case "-":
					System.out.println("Hai scelto sottrazione!");
					Sottrazione sott=new Sottrazione(n1,n2);
					sott.calcolo();
					break;
				case "*":
					System.out.println("Hai scelto moltiplicazione!");
					Moltiplicazione molt=new Moltiplicazione(n1,n2);
					molt.calcolo();
					break;
				case "/":
					System.out.println("Hai scelto divisione!");
					Divisione div=new Divisione(n1,n2);
					div.calcolo();
					break;
			}
		}while(operazione!="");
	}
}