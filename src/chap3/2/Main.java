public class Main {
	public static void main(String[] args) {
		int i = 10,j=10,x,y;
		++i;
		j++;
		System.out.println("i:" + i + ", j:" + j);
		
		i = 10;
		j = 10;
		x = ++i;
		y = --j;
		System.out.println("i:" + i + ",j:" + j+ ",x:" + x + ",y:" + y);
		
		i = 10;
		j = 10;
		x = i++;
		y = j--;
		System.out.println("i:" + i+ ",j:" + j + ",x:" + x + ",y:" + y);
		
		int a = 1,b = 1, c = 1, d = 1;
		System.out.println(a++);
		System.out.println(++b);
		System.out.println(c--);
		System.out.println(--d);
		System.out.println("a: " + a + ", " + "c:" + c);
	}
}