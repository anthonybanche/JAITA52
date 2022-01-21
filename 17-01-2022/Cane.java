
public class Cane extends Animale {
	
	public void emettiSuono() {
		System.out.println("Il cane fa bau");
	}
	
	public void pippo() {
		this.emettiSuono();
		super.emettiSuono();
	}

}
