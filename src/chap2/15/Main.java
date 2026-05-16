public class Main{
	public static void main(String[] args) {
		String t1 = """
				Language: %s
				Version: %d
				""".formatted("Java" ,15);
		System.out.println(t1);
		String t2 = "     Duke     \n  James";
		System.out.println(t2);
		System.out.println(t2.stripIndent());
		String t3 = "Hello\\n\\tworld";
		System.out.println(t3);
		System.out.println(t3.translateEscapes());
			
	}
}