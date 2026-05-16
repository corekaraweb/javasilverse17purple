package com.se;
import com.se.sub.Foo;

public class Main {
	public static void main(String[] args) {
		Foo s = new Foo();
		s.display();
		com.se.sub.Bar b = new com.se.sub.Bar();
		b.display();
	}
}