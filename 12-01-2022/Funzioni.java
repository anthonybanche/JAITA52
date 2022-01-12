package it.javaita54.generico;

public class Funzioni {
	
	public static void main(String[] args) { 
		
		int mem1=3;
		int mem2=5;
		
		System.out.println("Mem1 -> "+mem1);
		System.out.println("Mem2 -> "+mem2);
		
		//BY VAL - Il valore viene copiato da mem2 a mem1
		mem1 = mem2;
		mem2 = 6;
		
		//Dimostrato passaggio byVal in quanto mem1 non cambia al cambiare di mem2
		System.out.println("Mem1 -> "+mem1);
		System.out.println("Mem2 -> "+mem2);
		

	}  
	
	
	
	
}
