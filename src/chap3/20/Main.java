public class Main {
	public static void main(String[] args) {
		String s = "DDD";
		switch (s) {
		case "A","B" -> System.out.println("A-B");
		case "C","D" -> System.out.println("C-D");
		case "E","F" -> { System.out.println("E-F"); break;}
		default -> throw new RuntimeException("N/A");
		}
	}
}