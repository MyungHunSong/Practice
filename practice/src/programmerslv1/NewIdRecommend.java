package programmerslv1;

public class NewIdRecommend {
	// 문제 규칙.
	// 1.아이디 길이) 3 <= length <= 15
	// 2.아이디 => 알파벳 소문자, 숫자, 빼기(-), 밑줄 (_), 마침표(.)문자만 사용가능
	// 3.단 마침표는 처음과 끝에 사용불가 & 연속 사용도 불가

	/*
	 * 1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다. 
	 * 2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
	 * 3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
	 * 4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다. 
	 * 5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
	 *  6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을
	 * 모두 제거합니다. 만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
	 *  7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
	 */
	public static void main(String[] args) {

		String id = "...!@BaT#*..y.abcdefghijklm";
 
		System.out.println(soultion(id));

	}

	public static String soultion(String new_id) {
		new_id = new_id.toLowerCase(); // 소문자로 변경
		System.out.println(new_id);
		
		
		String id = ""; // 사용할 그릇

		// 2번 규칙 소문자 숫자 -_. 제외한 모든 문자 제거
		for (int i = 0; i < new_id.length(); i++) {
			char ch = new_id.charAt(i);

			// 이 조건에 부합 한것만 추가 하기에 다른것은 다 제거.
			if (ch >= 'a' && ch <= 'z') {
				id += String.valueOf(ch);
			} else if (ch >= '0' && ch <= '9') {
				id  += String.valueOf(ch);
			} else if (ch == '.' || ch == '-' || ch == '_') {
				id += String.valueOf(ch);
			}
		}

		// 3번 규칙 중첩된 (.) 하나만
		for (int i = 0; i < id.length(); i++) { 
			if (id.charAt(i) == '.') { 
				int j = i + 1;
				String dot = ".";

				while (j != id.length() && id.charAt(j) == '.') {
					dot += ".";
					j++;					

				} // while 문
				
				if (dot.length() > 1) 
					id = id.replace(dot, "."); 
			} // if문
		} // for문
		
		// 4. 첫번쨰, 마지막 (.) 제거
		if (id.startsWith(".")) {
			id = id.substring(1, id.length());
		} else if (id.endsWith(".")) {
			id = id.substring(0, id.length() - 1);
		}

		// 5. 빈 문자열 이라면 a대입
		if (id.length() == 0) {
			id += "a";
		}

		// 6. 16자 이상이면, 15자만 남김
		if (id.length() >= 16) {
			id = id.substring(0, 15);
		}

		// 7. 2자 이하라면, 마지막 문자 길이 3까지 반복해서 끝에 붙임
		String last = id.charAt(id.length() - 1) + "";
		if (id.length() == 2) {
			id = id + last;
		} else if (id.length() == 1) {
			id = id + last + last;
		}

		return id;
	}

}
