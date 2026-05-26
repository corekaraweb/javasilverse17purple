public class Person {
	public String name;
	{name = "N/A";}
	public Person() {
		
	}
	public Person(String name) { this.name = name;}
	
}
class Main {
	public static void main(String[] args) {
		Person one = new Person("Duke");
		Person two = one;
		two.name = "James";
		System.out.print(one.name + ":" + two.name + ":");
		Person three = new Person();
		System.out.print(three.name);
	}
}