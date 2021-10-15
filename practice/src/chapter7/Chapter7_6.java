package chapter7;

public class Chapter7_6 {

	public static void main(String[] args) {
		Outer ot = new Outer();
		Outer.Inner it = ot.new Inner();
		
		System.out.println(it.iv);

	}

}

class Outer{
	class Inner{
		int iv = 100;
	}
}
