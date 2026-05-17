public class Main {
	public static void main(String[] args) {
		int month = 12;
		System.out.println(month + " is " +
			switch (month) {
			case 12,1,2: yield "Winter";
			case 3,4,5: yield "Spring";
			case 6,7,8: yield "Summer";
			case 9,10,11: yield "Autum";
			default: yield "N/A";
			});
		String val = switch(month) {
		case 12,1,2 -> "Winter";
		case 3,4,5 -> "Spring";
		case 6,7,8 -> "Summer";
		case 9,10,11 -> "Autumn";
		default -> {System.out.println("N/A");yield "N/A";}
		};
		System.out.println(month + " is " + val);
		
	}
}