
public class EsempiArray {

	public static void main(String[] args) {
		
		int [] array = new int[10];
		Integer [] arrayInteger = new Integer[2];

		final int ARRAY_SIZE = 10;
		int [] finalArray = new int[ARRAY_SIZE];
		
		String [] arrayStringhe = new String[20];
		String [] codiciFiscali = new String[100];
		
							  //ELEMENTI SEPARATI DA VIRGOLE
		int [] votiScolastici = {8,7,3,9,2,5,10};
		
		for(int i = 0; i < array.length; i++) {
			array[i] = 100; 
		}
		
		for(int i = 0; i < array.length; i++) {
			//System.out.println(array[i]);
		}
		
		//Posizione 11 va in errore poiché non esiste
		//System.out.println(array[11]);
		
		int [][] matrix = new int[5][5];
		for(int i = 0; i < matrix.length; i++) { //RIGHE
			for(int j = 0; j < matrix[i].length; j++) { //COLONNE
				matrix[i][j] = 0;
				System.out.print(matrix[i][j]);
			}
			System.out.println("");
		}
		
		/*int [][] matrix2 = new int[5][];
		for(int i = 0; i < matrix2.length; i++) {
			matrix2[i] = new int[5];
		}*/
		
	}

}
