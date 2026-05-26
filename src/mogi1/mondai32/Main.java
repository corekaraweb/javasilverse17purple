public class Product {
	private double price;
	private Product() {
		this(100.0);
		System.out.print("1:" + price);
	}
	Product(double price) {
		price = price;
		System.out.print("2:" + price);;
	}
	public void print() {
		System.out.println("3:" + this.price);
	}
	public static void main(String[] args) {
		new Product().print();
	}
}