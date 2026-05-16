public class Main {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Apple ")
				.append("Lime ")
				.append("Kiwi ")
				.delete(6,11)
				.insert(6, "Lemon ");
		System.out.println("sb:" + sb);
		String str = sb.toString();
		System.out.println("str:" + str.toUpperCase());
	}
}