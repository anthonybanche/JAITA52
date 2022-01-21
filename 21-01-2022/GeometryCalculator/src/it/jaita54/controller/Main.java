package it.jaita54.controller;

import java.util.ArrayList;
import java.util.List;

import it.jaita54.model.Rettangolo;
import it.jaita54.model.Triangolo;

public class Main {
	public static void main(String[] Args) {

		Rettangolo r1=new Rettangolo(2,3);
		Rettangolo r2=new Rettangolo(9,1);
		
		Triangolo t1=new Triangolo(2,4,5);

		List<Rettangolo> rettangoli = new ArrayList<>();
		rettangoli.add(r1);
		rettangoli.add(r2);

		List<Triangolo> triangoli = new ArrayList<>();
		triangoli.add(t1);

		//Calcolo perimeto rettangoli
		for(int r=0; r<rettangoli.size(); r++) {
			Rettangolo rett=rettangoli.get(r);
			int perimetro=rett.getPerimetro();
			System.out.println("Perimetro rettangolo "+r+" : "+perimetro);
		}

		//Calcolo perimeto triangoli
		for(int t=0; t<triangoli.size(); t++) {
			Triangolo tri=triangoli.get(t);
			int perimetro=tri.getPerimetro();
			System.out.println("Perimetro triangolo "+t+" : "+perimetro);
		}

	}
}
