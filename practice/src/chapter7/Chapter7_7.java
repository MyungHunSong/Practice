package chapter7;

import chapter7.Outer2.Inner2;

public class Chapter7_7 {

	public static void main(String[] args) {
		Outer2.Inner2 so = new Inner2();
		System.out.println(so.iv);

	}

}

class Outer2{
	static class Inner2 {
		int iv = 200;
	}
}
