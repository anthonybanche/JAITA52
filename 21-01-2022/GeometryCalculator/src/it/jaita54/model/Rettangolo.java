package it.jaita54.model;

public class Rettangolo implements FormaGeometrica {
		//Costruttore Implicito
		public Rettangolo() {
			
		}
		
		//Costruttore Implementato
		public Rettangolo(int base, int altezza) {
			this.base=base;
			this.altezza=altezza;
		}
		
		//Attributi
		int base;
		int altezza;
		
		//Metodi
		public int getPerimetro() {
			int perimetro= (base+altezza)*2;
			return perimetro;
		}
}
