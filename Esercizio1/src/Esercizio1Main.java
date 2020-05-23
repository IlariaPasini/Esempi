
public class Esercizio1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b;
		a=10;
		b=12;
		inverti(a,b);
		System.out.println( " a="+ a + "  b=" + b);
	}

	private static void inverti(int a, int b) {
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println( " a="+ a + "  b=" + b);
	}

}