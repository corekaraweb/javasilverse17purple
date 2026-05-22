import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<String> list = List.of("Java","8","11","17");
		for (var i = 0; i<=list.size();i++) {
			try {
				Integer.parseInt(list.get(i));
				
			} catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
			} finally {
				System.out.println("Loop " + i + " has finished.");
			}
		}
	}
}