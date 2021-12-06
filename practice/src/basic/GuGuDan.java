package basic;

public class GuGuDan {
	public static void main(String[] args) {
		
		for(int i = 1; i <= 19; i++) {
			
			for(int j = 1; j <= 19; j++) {
				System.out.printf("%d * %d = %-4d ", i, j, i*j);				
			}
			System.out.println();
		}
	}
}
