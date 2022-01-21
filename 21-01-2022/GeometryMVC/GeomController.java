package it.jait54.geom.controller;

import java.util.ArrayList;
import java.util.List;

import it.jait54.geom.model.FormaGeometrica;
import it.jait54.geom.model.InputObject;
import it.jait54.geom.model.Rettangolo;
import it.jait54.geom.model.Triangolo;

public class GeomController {
	List<FormaGeometrica> forme;
	List<String> output;

	public void setInput(List<InputObject> input) {
		forme=new ArrayList<>();

		for(int i=0; i<input.size(); i++) {
			InputObject ogg=input.get(i);

			switch(ogg.getFormaGeometrica().toUpperCase()) {
			case "RETTANGOLO":
				Rettangolo re=new Rettangolo(ogg.getBase(), ogg.getAltezza());
				forme.add(re);
				break;

			case "TRIANGOLO":
				Triangolo tr=new Triangolo(ogg.getBase(), ogg.getLato1(), ogg.getLato2());
				forme.add(tr);
				break;
			}
		}
	}

	public void calcola() {
		output=new ArrayList<String>();
		
		for(int r=0; r<forme.size(); r++) {
			FormaGeometrica rett=forme.get(r);
			int perimetro=rett.getPerimetro();
			String tipoForma=rett.getClass().getName();
			output.add("Perimetro di "+tipoForma+" "+r+" : "+perimetro);
		}
	}

	public List<String> getOutput() {
		return output;
	}
}
