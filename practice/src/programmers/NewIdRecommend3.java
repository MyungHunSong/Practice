package programmers;

public class NewIdRecommend3 {
	// 정규 식을 사용하여 문제 풀기
	
	public static void main(String[] args) {
		String id1 = "...!@BaT#*..y.abcdefghijklm";
		String id2 = "z-+.^.";
		String id3 = "=.=";
		String id4 = "123_.def";
		String id5 = "abcdefghijklmn.p";
		
		System.out.println("first test : "+ soultion(id1));
		System.out.println("second test : "+ soultion(id2));
		System.out.println("Third test : "+ (id3));
		System.out.println("4th test : "+ (id4));
		System.out.println("5th test : "+ (id5));

	}
	
	public static String soultion(String new_id) {
		 
		
		String id = new_id.toLowerCase();
		id = id.replaceAll("[^-_.a-z0-9]", "");  //-_. 영문자 숫자만 남김
		id = id.replaceAll("[.]{2,}", "."); // .2개 이상 .으로 치환
		id = id.replaceAll("^[.]|[.]$", ""); // 처음과 끝 .제거	
		
		// 빈 문자열이라면 a 추가
		if(id.equals("")) {
			id += "a";
		}
		 
		// 16자 이상이면 15자로
		if (id.length() >= 16) {
			id = id.substring(0, 15);
			id = id.replaceAll("^[.]|[.]$", ""); //처음 . 끝. 제거 
		}
		
		//2자 이하라면 3자까지 마지막 문자추가
		if(id.length() <= 2) {
			while(id.length() < 3) {
				id += id.charAt(id.length() - 1);
			}
			return id;
		}
		
		return id;
	} 

}
