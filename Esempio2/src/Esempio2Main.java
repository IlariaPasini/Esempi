
public class Esempio2Main {

	public static void main(String[] args) {
		// creo matrice di numeri, controllo quanti elementi una riga abbia uguali a quella successiva nello stesso posto

		double[][] coefVin = {

				{ 0, 4, 0, 0, 0, 0, 0, -1, 3, 0 }, { 0, 0, 5, -7, 0, -3, 0, 0, 0, 0 },
				{ 0, -6, 0, 5, 0, 0, 0, -2, 0, 0 }, { 0, 0, 0, 1, 3, 0, 0, 0, 7, 0 }, { 0, 0, 2, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, -2 }, { 5, 1, 0, 0, 0, 0, 0, 0, 0, 7 }, { 0, 0, 0, 0, 0, 1, 5, 2, 3, 0 },
				{ -6, 0, 0, -6, 0, 0, 0, 0, -5, 0 } };

		int elemUguali = 0;

		
		
		for(int i=0; i<8; i++) {
			for(int j=0; j<10; j++) {
				if(coefVin[i][j]==coefVin[i+1][j]) {
					elemUguali++;
				}
			}
		}
		System.out.println(elemUguali);
	}
	
}