public class Main {
	public static void main(String[] args) {
		int a = 1;
		do {
			System.out.print(a + " ");
			a += 2;
		} while (a < 10);
		int b = 1;
		System.out.println("\n-----");
		do 
			System.out.print(b + " ");
		while ((b += 2) < 10);
	}
}