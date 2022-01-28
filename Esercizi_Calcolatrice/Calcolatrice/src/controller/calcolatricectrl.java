package controller;
import java.util.Scanner;

import model.Moltiplicazione;
import model.Somma;
import model.Sottrazione;
import model.Divisione;

public class calcolatricectrl {
	public void Prendinumeri(double op1, double op2)throws Exception {

		Scanner sc= new Scanner(System.in);
		System.out.println("Scegli l'operazione tra +, -, /, *");
		String operazione = sc.nextLine();

		switch(operazione) {
		case "+":

			System.out.println("Scrivere operatore1");
			op1 = sc.nextDouble();

			System.out.println("Scrivere operatore2");
			op2 = sc.nextDouble();

			Somma risultato= new Somma(op1, op2);
			System.out.println(	risultato.faiOperazione());
			break;

		case "-":
			System.out.println("Scrivere operatore1");
			op1 = sc.nextDouble();

			System.out.println("Scrivere operatore2");
			op2 = sc.nextDouble();

			Sottrazione risultato2= new Sottrazione(op1, op2);
			System.out.println(	risultato2.faiOperazione());	
			break;
		case "/":
			System.out.println("Scrivere operatore1");
			op1 = sc.nextDouble();

			System.out.println("Scrivere operatore2");
			op2 = sc.nextDouble();
			if (op2 == 0)
	 throw new Exception ("Impossibile dividere per zero, ritenta sarai piu fortunato");
			Divisione risultato3= new Divisione(op1, op2);
			System.out.println(	risultato3.faiOperazione());
			break;
		case "*":
			System.out.println("Scrivere operatore1");
			op1 = sc.nextDouble();

			System.out.println("Scrivere operatore2");
			op2 = sc.nextDouble();
			Moltiplicazione risultato4= new Moltiplicazione(op1, op2);
			System.out.println(	risultato4.faiOperazione());	
			break;
		}

	}

}
