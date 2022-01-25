import java.util.ArrayList;
import java.util.List;

public class MainPacco {

	public static void main(String[] args) {
		Pacco p = new Pacco(10,2,3);
		p.setNumero(999999);
		
		System.out.println("Il volume del pacco è: " + p.volume());
	}

}
