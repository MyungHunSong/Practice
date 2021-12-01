package programmers;

public class MainSolution {

	public static void main(String[] args) {
		
		String id = "...!@BaT#*..y.abcdefghijklm";
		String answer = new NewRecommendCls(id)
				.filter()
				.toSingleDot()
				.noStartEndDot()
				.noBlank()
				.noMuchThen16()
				.noLessThan2()
				.getResult();
		
		System.out.println("답 : " + answer);
		 	
	}

}
