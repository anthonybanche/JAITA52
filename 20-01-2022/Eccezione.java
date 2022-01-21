import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Eccezione {

	public static void main(String[] args) throws Exception {
		
		int [] array = new int [3];
		// 0 1 2 - >3 da qui in poi non esiste più nulla
		
		try {
			// Blocchi di codice da provare ad eseguire
			array[3] = 2;
		} catch (Exception e) {
			// Blocchi di codice da eseguire in caso di eccezione
			System.out.println("Errore relativo all'array");
		} finally { // Non obbligatorio
			// Dopo aver eseguito i blocchi di codice con/senza errori,
			// Eseguiamo Blocchi di codice per finire il tutto
		}
		System.out.println("Ciao");
		
		
		// Si possono usare più
		try {
			array[3] = 2;
		} catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println("Errore relativo all'array");
		} catch (Exception e2) {
			System.out.println("Errore durante l'esecuzione del programma");
		}
		
		Scanner s = new Scanner(System.in);
		try {
			//System.out.println("Inserire un numero: ");
			//s.nextInt();
		} catch(InputMismatchException ex) {
			System.out.println("Errore di tipo InputMismatch");
			//System.out.println(ex.getStackTrace());
			//System.out.println(ex.getMessage());
			//ex.printStackTrace();
		} catch(Exception e) {
			System.out.println("Errore durante l'esecuzione del programma");
			e.getStackTrace();
		}
		
		System.out.println("Inserire Pluto");
		if(s.hasNext()) {
			String input = s.nextLine();
			if(input.equals("Pluto")) {
				System.out.println("Bravo!");
			} else {
				//throw new Exception("Non hai scritto Pluto!");
				throw new InputMismatchException("Non hai scritto Pluto!");
			}
		}
		
		//leggiFile("C:\\Users\\FMUSCIO\\eclipse-workspace\\Test\\src\\pippo.txt");
		try {
			leggiFile("src\\pippo.txt");
		} catch (EccezioneDiTest ex) {
			System.out.println(ex.getMessage());
			System.out.println("Ecco qui che non hai trovato il file!");
		}
	}

	
	public static void test() throws Exception {
		throw new Exception("Perché chiami questo metodo!");
	}
	
	public static void leggiFile(String inputPath) throws EccezioneDiTest {
		FileInputStream fis = null; //Legge lo stream di dati ottenuto da un path
		//Path path = Paths.get(""); //Legge il path corrente del progetto (dove siamo nel filesystem)
		//String pathProgetto = path.toAbsolutePath().normalize().toString();
		try {
			fis = new FileInputStream(inputPath); //Concatenazione del path di progetto con il file creato
			//Oggetti particolari di Java che servono ad ottenere flussi di dati (esempio: file, cartelle, ecc...)
			BufferedReader br = new BufferedReader(new InputStreamReader(fis));
			String linea = "";
			//br.readLine() -> legge riga per riga finchè non finisce il contenuto
			while((linea = br.readLine()) != null) {
				System.out.println(linea);
			}
		} catch(FileNotFoundException e) {
			//Se il path è sbagliato non si trova il file
			throw new EccezioneDiTest("Non ho trovato il file!");
		} catch(Exception ex) {
			System.out.println("Errore non previsto");
		}
	}
	
}
