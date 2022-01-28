package Controller;

import java.util.InputMismatchException;
import java.util.Scanner;

import model.Moltiplicazione;
import model.Somma;
import model.Sottrazione;

public class CalcolatriceCtrl {

	public void Acquisizione(double operatore1, double operatore2) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Scegli l'operazione tra somma, sottrazione, divisione, moltiplicazione");
		String operazione = sc.nextLine();

		switch(operazione) {
		case "somma":
			try {
			System.out.println("Scrivere operatore1");
			operatore1 = sc.nextDouble();
			} catch(InputMismatchException ex) {
				System.out.println("Non è un numero");
				sc.nextLine();
			}
			System.out.println("Scrivere operatore2");
			operatore2 = sc.nextDouble();

			Somma risultato= new Somma(operatore1, operatore2);
			System.out.println(	risultato.operazioni());
			break;

		case "sottrazione":
			System.out.println("Scrivere operatore1");
			operatore1 = sc.nextDouble();

			System.out.println("Scrivere operatore2");
			operatore2 = sc.nextDouble();

			Sottrazione risultato2= new Sottrazione(operatore1, operatore2);
			System.out.println(	risultato2.operazioni());	
			break;
		case "divisione":
			System.out.println("Scrivere operatore1");
			operatore1 = sc.nextDouble();

			System.out.println("Scrivere operatore2");
			operatore2 = sc.nextDouble();

			Sottrazione risultato3= new Sottrazione(operatore1, operatore2);
			System.out.println(	risultato3.operazioni());
			break;
		case "moltiplicazione":
			System.out.println("Scrivere operatore1");
			operatore1 = sc.nextDouble();

			System.out.println("Scrivere operatore2");
			operatore2 = sc.nextDouble();
			Moltiplicazione risultato4= new Moltiplicazione(operatore1, operatore2);
			System.out.println(	risultato4.operazioni());	
			break;
		}

	}
}	
