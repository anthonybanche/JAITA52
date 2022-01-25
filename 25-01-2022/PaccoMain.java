
public class PaccoMain {
	public static void main(String args[]) {
		Pacco p1 = new Pacco(3.5, 4.5, 6.0);
		p1.setNumero(3);
		System.out.println("Il numero del pacco e': " + p1.numero);
		System.out.println("Il volume del pacco e’: " + p1.volume());
		PaccoAColori p2 = new PaccoAColori(2.4, 5.3, 5.5);
		p2.setColore("rosso");
		p2.stampaVolume();
	}
}
