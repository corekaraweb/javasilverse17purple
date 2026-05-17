public class Main {
	public static void main(String[] args) {
		if (args.length != 0) {
			String s = args[0];
			if (s.length() == 4) {
				System.out.println("s.length() == 4");
			} else {
				System.out.println("Other");
			}
		} else {
			System.out.println("No arguments");
		}
	}
}