package basic;

// 피보 나치 수열 (재귀 호출)
public class Fibo {
	public static void main(String[] args) {

		int n = 6;
		//System.out.println(fibo1(n)); //1번 방법
		
		System.out.println(fibo2(n));
		
	}
	
	

	private static int fibo2(int n) {
		if(n == 0 ) {
			return 0;
		}else if(n == 1) {
			return 1;
		}
		
		int a = 0;
		int b = 1;
		int c = 1;
		
		for(int i =0; i< n-2; i++) {
			a = b;
			b = c;
			c = a + b;
		}
		
		
		return c;
	}



	/*
	 * private static int fibo1(int n) {
	 * 
	 * if (n == 0) { return 0; } else if (n == 1) { return 1;
	 * 
	 * } else { System.out.printf("%d + %d = %d%n", fibo(n - 1), fibo(n - 2),fibo(n
	 * - 1) + fibo(n - 2)); return fibo(n - 1) + fibo(n - 2); }
	 * 
	 * }
	 */
}
