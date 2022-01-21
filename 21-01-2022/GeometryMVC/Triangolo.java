package it.jait54.geom.model;

public class Triangolo implements FormaGeometrica{

	//Costruttore Implicito
	public Triangolo() {

	}

	//Costruttore Implementato
	public Triangolo(int lato1, int lato2, int lato3) {
		this.lato1=lato1;
		this.lato2=lato2;
		this.lato3=lato3;
	}

	//Attributi
	int lato1;
	int lato2;
	int lato3;


	//Metodi
	public int getPerimetro() {
		int perimetro= lato1+lato2+lato3;
		return perimetro;
	}
	
	public int getArea() {
		return 0;
	}
}