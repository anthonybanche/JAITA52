package controller;

import java.util.Scanner;

import model.Divisione;
import model.Moltiplicazione;
import model.Somma;
import model.Sottrazione;

public class CalcoliContr {

	public CalcoliContr() {

	}

	public void faiCalcoli() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserisci il primo numero:");
		double num1 = sc.nextDouble();
		sc.nextLine();
		System.out.println("Inserisci il secondo numero:");
		double num2 = sc.nextDouble();
		sc.nextLine();
		System.out.println("Inserire operatore aritmetico:");
		String operatore = sc.nextLine();

		switch (operatore) {
		case "+":
			Somma addizione = new Somma(num1, num2);
			addizione.operazioni();
			break;
		case "-":
			Sottrazione meno = new Sottrazione(num1, num2);
			meno.operazioni();
			break;
		case "*":
			Moltiplicazione per = new Moltiplicazione(num1, num2);
			per.operazioni();
			break;
		case "/":
			Divisione dividi = new Divisione(num1, num2);
			dividi.operazioni();
			break;
		}
	}

}
