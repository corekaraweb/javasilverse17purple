public class Main {
	public static void main(String[] args) {
		var v1 = "Hello Java SE";
		var v2 = new StringBuilder("Hello Java SE");
		var v3 = v1.replace("Hello", "Hi");
		var v4 = v2.replace(0,5,"Hi").toString();
		String s = "";
		if (v1 == v3) {
			if (v1 == v4) s = "v1,v3,v4";
		} else {
			if (v3.equals(v4)) 
				s = "v3,v4";
			s = "N/A";
		}
		System.out.println(s);
	}
}