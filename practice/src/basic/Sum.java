package basic;

// 1~100 더하기
public class Sum {
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 0; i <= 100; i++) {
			sum += i;
		}
		
		System.out.println(sum);
	}
}
