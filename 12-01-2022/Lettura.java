package it.javaita54.generico;

import java.util.Scanner;

public class Lettura {

	public static void main(String[] args) { 

		int iBase;
		int iAltezza;
		
		//Metodo I - Argomenti
		System.out.println("Passati: "+args.length+ " argomenti");
		if(args.length==2) {
			String base=args[0];
			String altezza = args[1];

			iBase= Integer.parseInt(base);
			iAltezza = Integer.parseInt(altezza);
		}else {
			//Metodo II - Scanner
			Scanner scan=new Scanner(System.in);
			System.out.println("Inserire base ");
			iBase= scan.nextInt(); // per leggere interi
			// scan.nextLine() per leggere stringa
			System.out.println("Inserire altezza ");
			iAltezza= scan.nextInt();
		}


		int area=calcoloAreaRett(iBase, iAltezza);
		System.out.println("L'area è:"+area);
		System.exit(0);


	}


	private static int calcoloAreaRett(int base, int altezza) {
		int area= base*altezza;
		return area;
	}

}
