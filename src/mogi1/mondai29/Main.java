public class Main {
	public static void main(String... args) {
		try {
			String text = args[0].trim();
			int length = text.length();
		} catch (NullPointerException | NumberFormatException | ArrayIndexOutOfBoundsException e) {
			e = new NullPointerException("Wrong operation");
		} catch (Exception exception) {
			exception = new Exception("Unknown error");
		}
	}
}