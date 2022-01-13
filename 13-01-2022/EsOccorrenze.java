package it.javaita54.operatorilogici;

import java.util.Scanner;

public class EsOccorrenze {

	public static void main(String[] args) {
		// Scrivi un programma in linguaggio Java che legga da tastiera una frase e una parola,
		// queste devono essere passate ad un metodo 
		// che restituisce il numero di occorrenze della parola nella frase.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserisci frase");
		String frase= "ciao bella ciao";//sc.nextLine();
		
		System.out.println("Inserisci parola");
		String parola= "ciao";//sc.nextLine();
		
		int occorrenze=controllo(frase,parola);
		System.out.println("Trovate "+occorrenze);
	
		
	}
	
	public static int controllo(String frase, String parola) {
		int lunghParola= parola.length();
		int indicePartenza=0;
		int contatore=0;
		
		int indiceTrovato=-1;
		do {
			if(indiceTrovato!=-1) {
				contatore++;
				indicePartenza=indiceTrovato+lunghParola;
			}
			indiceTrovato=frase.indexOf(parola, indicePartenza);
		}while(indiceTrovato!=-1);
		
		return contatore;
		
	}

}
