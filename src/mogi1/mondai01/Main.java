public class Main {
	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = new String("Java");
		String s3 = "Java";
		String s4 = new String("Java").intern();
		String s5 = "java";
		String s6 = """
				Java
				""";
		System.out.println(
				(s1 == s2) 
				+ ":" + (s1 == s3)
				+ ":" + (s3 == s4)+":"+(s3 == s5)
				+ ":" + (s5 == s6)+":"+(s5.equals(s6)));
				
	}
}