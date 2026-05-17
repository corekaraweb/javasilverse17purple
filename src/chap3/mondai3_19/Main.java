public class Main {
	public static void main(String[] args) {
		int i = 5;
		switch (i--) {
		case 4 -> i -= 2;
		case 3 -> {i *= 2;}
		default -> --i;
		}
		System.out.println(i);
	}
}