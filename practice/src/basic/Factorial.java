package basic;

public class Factorial {
	
	// 재귀 호출
	public static void main(String[] args) {
		int input = 5;
		
		System.out.println(fact(input));
		
	}

	private static int fact(int n) {
		if(n <= 1) {
			return n;
		}else 
			
		//System.out.printf("%d * %d = %d%n", fact(n-1), n, fact(n-1) * n);
		System.out.printf(" %d ",fact(n-1));
		
		return fact(n-1) * n; // 스택에 싸인후 fact(n-1) 이 친구가 계속 값을 리턴 받는다. 최종 스택 곱셈공식의 식이 나오게 된다.
	}
	
}
