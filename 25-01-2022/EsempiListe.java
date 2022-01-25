import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EsempiListe {

	public static void main(String[] args) {
		List<String> stringhe = new ArrayList<>();
		List<String> linkedStringhe = new LinkedList<>();
		
		stringhe.add("Ciao mi chiamo");
		stringhe.add("Giuseppe");
		
		//stringhe.add(0, "");
		//stringhe.contains("");
		
		stringhe.addAll(linkedStringhe);
		System.out.println("Dimensione della mia lista: "+ stringhe.size());
		System.out.println("La mia lista è vuota? :" + stringhe.isEmpty());
		//stringhe.remove(0);
		stringhe.removeAll(linkedStringhe);
		//System.out.println(stringhe);
		
		for(String s : stringhe) {
			System.out.println(s + ": è lunga " + s.length() + " caratteri");
		}
		
		
		
		List<Pacco> pacchi = new ArrayList<>();
		pacchi.add(new Pacco(1,2,3));
		pacchi.add(new Pacco(14.5,22.3,3.5));
		pacchi.add(new Pacco(10,20,30));
		
		for(Pacco p : pacchi) {
			p.setNumero((int) (Math.random() * 1000));
			System.out.println("Pacco numero: " + p.numero);
		}
		
		
		List<Object> oggetti = new ArrayList<>();
		oggetti.add(new String("Ciao"));
		oggetti.add(new Pacco(1,2,3));
		oggetti.add(new PaccoAColori(5,6,7));
		oggetti.add(new Quadrato());
		
		//Pacco pippo = (Pacco) oggetti.get(3);
		//pippo.setNumero(1);
		//System.out.println(pippo.numero);
		
		List<Pacco> pacchiFiltrati = new ArrayList<>();
		
		for(Object o : oggetti) {			
			if(o instanceof Pacco) {
				((Pacco) o).setNumero((int) (Math.random() * 1000));
				System.out.println(((Pacco) o).numero);
				pacchiFiltrati.add((Pacco) o);
			} else if(o instanceof Forma) {
				System.out.println(((Forma) o).perimetro);
			} else if(o instanceof String) {
				System.out.println(o.toString());
			}
		}
		
		for(Pacco p : pacchiFiltrati) {
			//Operazioni sui pacchi
		}
		
		
	}
	
}
