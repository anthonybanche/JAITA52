package it.javaita54.generico;

public class Scambio {

	public static void main(String[] args) { 

		int mem1=3;
		int mem2=5;
		
		System.out.println("Mem1 -> "+mem1);
		System.out.println("Mem2 -> "+mem2);
		
		int ris1=somma(mem1,1);
		int risultato=somma(mem1,ris1);
		//Equivalente: int risultato=somma(mem1,somma(mem1,1));
		System.out.println("Risultato Somma -> "+risultato);
		
		
		//BY VAL - Il valore viene copiato da mem2 a mem1
		int temporanea=mem1;
		mem1 = mem2;
		mem2 = temporanea;

		//Dimostrato passaggio byVal in quanto mem1 non cambia al cambiare di mem2
		System.out.println("Mem1 -> "+mem1);
		System.out.println("Mem2 -> "+mem2);
		
		//CASTING
		double d = 4.5;
		System.out.println("D -> "+d);
		
		int intd= (int) d;
		System.out.println("IntD -> "+intd);
		
		//PARSING
		int intero;
		String eta="127";
		intero = Integer.parseInt(eta);
		System.out.println("intero -> "+intero);
		
		String val1="10";
		String val2="11";
		
		int val1int = Integer.parseInt(val1);
		int val2int = Integer.parseInt(val2);
		int ris = val1int + val2int;
		
		System.out.println("Somma -> "+ris);
		System.out.println("Somma -> "+(val1int+val2int));
		System.out.println("Somma -> "+somma(val1int, val2int));

	}
	
	public static int somma(int op1, int op2) {
		int r=op1+op2;
		return r;
	}

}
