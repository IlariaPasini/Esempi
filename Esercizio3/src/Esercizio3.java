
public class Esercizio3 {

	public static void main(String[] args) {
		String stringa1="Evviva";
		String stringa2="Che Bello il";
		String stringa3="Programma Arnaldoo";
		String primaEseconda = stringa1.concat(stringa2);
		String frase=primaEseconda.concat(primaEseconda);
		String stringa1_copy="Evviva";
		
		//Confornto fra stringhe
		if(stringa1==stringa1_copy) {
			System.out.println("*meme di spiderman che si indica* siamo proprio gemellini");
		}else {
			System.out.println("E inveceeeee");
		}
	}
}
