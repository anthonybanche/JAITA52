
public class Conto {
	private String nome; // IDENTIFICATIVO UNIVOCO DEL CONTO
	private float deposito;

	public Conto(String nome, float depositoIniziale) {
		this.nome = nome;
		this.deposito = depositoIniziale;
	}

	public float aggiungiSaldo(float soldi) {
		this.deposito += soldi;
		return this.deposito;
	}

	//GETTER
	public float restituisciSaldo() {
		return deposito;
	}
	
	//SETTER
	public float prelevaSaldo(float soldi) {
		if(this.deposito > soldi) {
			this.deposito -= soldi;
		}else {
			System.out.println("Non puoi prelevare troppo!");
		}
		return this.deposito;
	}

}
