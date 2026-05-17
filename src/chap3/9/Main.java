public class Main {
	public static void main(String[] args) {
		int[] arr = null;
		System.out.println("arr == null:" + (arr == null));
		arr = new int[3];
		System.out.println("arr != null:" + (arr != null));
	}
}