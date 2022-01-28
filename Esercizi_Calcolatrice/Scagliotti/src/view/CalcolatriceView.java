package view;
import controller.CalcolatriceController;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import controller.CalcolatriceController;
import model.CalcolatriceException;
public class CalcolatriceView {

	public static void main(String[] args) {
		double operatore1;
		double operatore2;
		String o;
		double risultato=0;
		Scanner sc= new Scanner(System.in);
		 List<String> list=new ArrayList<String>();  

//INSERIMENTO OPERATORI E CONTROLLO SU OPERATORI CHE SIANO DAVVERO NUMERI	
		do{
		try {
			System.out.println("Inserisci l'operatore 1:");
			operatore1=Double.parseDouble(sc.nextLine());
			}
			catch(NumberFormatException e) {
			  System.out.println("Non hai inserito un numero, riprova:");
			  operatore1=Double.parseDouble(sc.nextLine());
			}
		
		try {
			System.out.println("Inserisci l'operatore 2:");
			operatore2=Double.parseDouble(sc.nextLine());
			}
			catch(NumberFormatException e) {
			  System.out.println("Non hai inserito un numero, riprova:");
			  operatore2=Double.parseDouble(sc.nextLine());
			}	
		
		
	
		
		
		
		o= CalcolatriceController.leggiOperazione();
		if(o.equals("fine")) {
			System.out.println("FINE PROGRAMMA");
		}else {
		
		try {
	 risultato= CalcolatriceController.controlloOperazione(operatore1, operatore2, o);
		}catch(CalcolatriceException ce) {  
			System.out.println(ce);
		}
	System.out.println("Il risultato dell'operazione e': "+ risultato);
		}
		 list.add("Operazione: "+operatore1+o+operatore2+"="+risultato);  
	}while(!o.equals("fine"));
		int a=list.size()-1;
		list.remove(a);
		System.out.println("--- Storico: ---");
		for (String storico: list) {
			System.out.println(storico);
			
		}
	}//chiusura main

}
	

