
public class Test {

	public static void main(String[] args) {
		System.out.println("Hello, world!");
		System.out.println("Dolžina:" + dolzina(6));
		System.out.println("Najveèji:" + najvecji(6));
		izpis(1315);

	}
	public static int dolzina (int n) {
		int stevec = 1;
		while (n > 1) {
			if (n % 2 == 0) n /= 2;
			else n = n * 3 + 1;
			++ stevec;
		}
		return stevec;
	}
	public static int najvecji(int n) {
		int naj = n;
		while (n > 1) {
			if (n % 2 == 0) n /= 2;
			else n = n * 3 + 1;
			if (n > naj) naj = n;
		}
		return naj;
	}
	public static void izpis(int n) {
		System.out.print(n + ", ");
		while (n > 2) {
			if (n % 2 == 0) n /= 2;
			else n = n * 3 + 1;
			System.out.print(n + ", ");
		}
		System.out.println(1);
	}

}