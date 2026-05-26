class InvalidDataException extends Exception {
	public InvalidDataException(String message, Throwable cause) {
		super(message,cause);
	}
}
public class Main {
	public static void main(String[] args) {
		String[] text = {null,"17","Duke"};
		for (String s:text) {
			try {
				if(validate(s)) System.out.println(s);
			} catch (Exception e) {
				System.out.println(e.getCause());
			}
		}
	}
	public static boolean validate(String s) throws Exception {
		try {
			char c = s.charAt(0);
			int a = Integer.parseInt(s);
		} catch(NullPointerException | NumberFormatException e) {
			throw new InvalidDataException(e.getMessage(),e);
		}
		return true;
	}
}