public class Main {
	public static void main(String[] args) {
		String s = "DDD";
		switch(s) {
		case "A":
			System.out.println("A");break;
		case "B":
			System.out.println("B");break;
		case "C","D":
			System.out.println("C,D");break;
		default:
			System.out.println("Other");
		}
	}
}