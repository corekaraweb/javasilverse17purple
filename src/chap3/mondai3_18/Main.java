public class Main {
	public static void main(String[] args) {
		final char a = 'a';
		char k = 'k';
		int val = 0;
		switch ("Black".charAt(3)) {
		case a:
			val += 1;break;
		case a +2:
			val += 2;
		case k:
			val +=3;
		}
		System.out.println(val);
	}
}