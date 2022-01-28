package View;

import java.util.Scanner;

import Model.Divisione;
import Model.Moltiplicazione;
import Model.Somma;
import Model.Sottrazione;
public class Calcolatrice {
	public static void main(String[] args) {
		
		System.out.println("scegli tra un operatore + - * /");
		Scanner sc= new Scanner(System.in);
		System.out.println("inserisci primo numero");
		double op1=sc.nextInt();
		System.out.println("inserisci secondo numero");
		sc.nextLine();
		double op2 =sc.nextInt();
		sc.nextLine();
		System.out.println("inserisci operazione");
		String comando= sc.nextLine();
		
	switch(comando) {
	case "+" :
	Somma piu = new Somma(op1, op2);
	System.out.println(piu.FaiOperazione());
	break;
	case "-" :
		Sottrazione meno = new Sottrazione(op1, op2);
		System.out.println(meno.FaiOperazione());
		break;
	case "*" :
		Moltiplicazione per = new Moltiplicazione(op1, op2);
		System.out.println(per.FaiOperazione());
		break;
	case "/" :
		Divisione diviso = new Divisione(op1, op2);
		System.out.println(diviso.FaiOperazione());
		break;
		}
	}
}

