public class Main {
	public static void main(String[] args) {
		short s = 10;
		int i = 10;
		float f = 10.0F;
		double d = 10.0;
		char a = 'a';
		String s1 = "Duke";
		String s2 = new String("Duke");
		
		System.out.println("s == i : " + (s == i));
		System.out.println("f == d : " + (f == d));
		System.out.println("a != 'A' :" + (a != 'A'));
		System.out.println("s1 == s2 : " + (s1 == s2));
	}
}