package view;

import java.util.Scanner;

import controller.Controller;
import model.Somma;
import model.Divisione;
import model.Moltiplicazione;
import model.Sottrazione;
import model.Calcolo;

public class Calcolatrice_view {
	public static void main(String [] args){ 


	    System.out.println("scegli tra un operatore +  -  *  /");
		Scanner sc= new Scanner(System.in);
		System.out.println("inserisci primo numero ");
		double op1=sc.nextInt();
		System.out.println("inserisci secondo numero");
		sc.nextLine();
		double op2 =sc.nextInt();
     	sc.nextLine();
		System.out.println("inserisci operazione");
		String comando= sc.nextLine();
	

		Controller cont=new Controller();
		System.out.println(cont.faiCalcolo(comando, op1, op2));

		
	
}
}