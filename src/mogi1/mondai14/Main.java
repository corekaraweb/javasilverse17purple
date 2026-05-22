public class Main {
	protected void main(int a) {
		final var FLAG = true;
		final int VALUE;
		if (!FLAG) VALUE = 100;
		System.out.println(VALUE);
	}
	public static void main(String[] args) {
		new Main().main(100);
	}
}