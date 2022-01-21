package it.jaita54.controller;

import java.util.ArrayList;
import java.util.List;

import it.jaita54.model.FormaGeometrica;
import it.jaita54.model.Rettangolo;
import it.jaita54.model.Triangolo;

public class MainInterfaccia {
	public static void main(String[] Args) {

		Rettangolo r1=new Rettangolo(2,3);
		Rettangolo r2=new Rettangolo(9,1);
		
		Triangolo t1=new Triangolo(2,4,5);

		//Creo la lista di forme
		List<FormaGeometrica> forme = new ArrayList<>();
		
		//Metto i rettangoli nella lista
		forme.add(r1);
		forme.add(r2);
		//Metto i triangoli nella lista
		forme.add(t1);

		//Calcolo perimeto rettangoli
		for(int r=0; r<forme.size(); r++) {
			FormaGeometrica rett=forme.get(r);
			int perimetro=rett.getPerimetro();
			String tipoForma=rett.getClass().getName();
			
			
			
			System.out.println("Perimetro di "+tipoForma+" "+r+" : "+perimetro);
		}
		
		System.out.println("Ciao".getClass().getName());

		

	}
}
