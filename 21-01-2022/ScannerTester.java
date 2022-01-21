package it.jaita54.stringhe;

import java.util.Scanner;

public class ScannerTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserisci stringa, e premi invio.");
		String lettoDaScanner=sc.nextLine();
		
		System.out.println("Inserisci intero, e premi invio.");
		int lettoIntDaScanner=sc.nextInt();
		
		System.out.println(lettoDaScanner);
		
		sc.close();
	}

}
