public class Main {
	public static void main(String[] args) {
		int[][] array = new int[2][3];
		array[0][0] = 100;
		array[1][2] = 200;
		
		System.out.println("array[0][0]:"+ array[0][0]);
		System.out.println("array[0][1]:"+ array[0][1]);
		System.out.println("arrya[0][2]:"+ array[0][2]);
		System.out.println("array[1][0]:"+ array[1][0]);
		System.out.println("array[1][1]:"+ array[1][1]);
		System.out.println("arrya[1][2]:"+ array[1][2]);
		System.out.println("=========================");
		System.out.println("array.length:" + array.length);
		System.out.println("array[0].length:" + array[0].length);
		System.out.println("array[1].length:" + array[1].length);
	}
}