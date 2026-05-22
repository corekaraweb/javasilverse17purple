public class Book {
	private static final int id = 17;
	String title;
	{title = "Java Silver";}

}
class Main {
	public static void main(String... args) {
		Book book = new Book();
		System.out.println(book.title);
	}
}