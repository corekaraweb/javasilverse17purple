class Main {
	public static void main(String[] args) {
		main(new Main(),args);
	}
	static void main(Main m, String... s) {
		System.out.println(m + ", " + s);
	}
}