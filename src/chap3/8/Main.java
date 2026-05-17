public class Main {
	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("James");
		StringBuilder sb2 = new StringBuilder("James");
		System.out.println("sb1.equals(sb2):" + sb1.equals(sb2));
		String s1 = sb1.toString();
		String s2 = sb2.toString();
;		System.out.println("s1.equals(s2):" + s1.equals(s2));
	}
}