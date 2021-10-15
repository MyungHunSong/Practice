package chapter7;

public class Chapter7_8 {

	public static void main(String[] args) {
		Outer3 ot = new Outer3();
		Outer3.Inner3 inner = ot.new Inner3();
		
		inner.method1();

	}

}

class Outer3{
	int value = 10;
	
	class Inner3{
		int value = 20;
		
		void method1() {
			int value = 30;
			
			System.out.println(value);
			System.out.println(this.value);
			System.out.println(Outer3.this.value);
			
		}
	}
}
