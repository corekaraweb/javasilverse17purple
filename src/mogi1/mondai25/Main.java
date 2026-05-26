public class Main {
	public static void main(String... args) {
		System.out.println(MyClass.a + ":" + new MyClass().getB());
	}
}
class MyClass {
	static double a;
	private int b;
	static { a = 100.0; }
	private static double getA() {return a;}
	int getB() {return b;}
	public String toString() {return "MyClass:" + a + "," + b;}
}