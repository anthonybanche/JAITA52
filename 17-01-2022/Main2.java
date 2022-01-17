
public class Main2 {

	public static void main(String[] args) {
		
		Lampadina lampadinaCucina = new Lampadina(false);
		Lampadina lampadinaSalotto = new Lampadina(false);
		lampadinaCucina.accendi();
		
		System.out.println("Stato cucina: " + lampadinaCucina.isAccesa());
		System.out.println("Stato salotto: " + lampadinaSalotto.isAccesa());
		
		lampadinaCucina.isAccesa();
		
		
		Animale rex = new Cane();
		rex.emettiSuono();
		Animale aristogatto = new Gatto();
		aristogatto.emettiSuono();
		
		Cane fido = new Cane();
		fido.pippo();
		
		
	}

}
