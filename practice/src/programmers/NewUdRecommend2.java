package programmers;

public class NewUdRecommend2 {
	public static void main(String[] args) {
		String id = "...!@BaT#*..y.abcdefghijkl";
		System.out.println("chartAt(id)" + id.charAt(0) );
		System.out.println(soultion(id));
		
		for (int i = 0; i < id.length(); i++) { 
			if (id.charAt(i) == '.') { 
				int j = i + 1;
				String dot = ".";
				System.out.println("here is J : " + j);

				while (j != id.length() && id.charAt(j) == '.') {
					dot += ".";
					System.out.println("here is dot : " + dot);
					j++;
				} // while 문

				if (dot.length() > 1) 
					id = id.replace(dot, ".");

			} // if문
		} // for문
	}
	
	public static String soultion(String new_id) {
		new_id = new_id.toLowerCase(); // 소문자로 변경

		
		String id = "";
		
		//2번 규칙
		id = rule2(new_id, id);

		// 3번 규칙 중첩된 (.) 하나만
		id = rule3(id);
		
		// 4. 첫번쨰, 마지막 (.) 제거
		id = rule4(id);

		// 5. 빈 문자열 이라면 a대입
		id = rule5(id);

		// 6. 16자 이상이면, 15자만 남김
		id = rule6(id);

		// 7. 2자 이하라면, 마지막 문자 길이 3까지 반복해서 끝에 붙임
		String last = id.charAt(id.length() - 1) + "";
		id = rule7(id, last);

		return id;
	}

	private static String rule7(String id, String last) {
		if (id.length() == 2) {
			id = id + last;
		} else if (id.length() == 1) {
			id = id + last + last;
		}
		return id;
	}

	private static String rule6(String id) {
		if (id.length() >= 16) {
			id = id.substring(0, 15);
		}
		return id;
	}

	private static String rule5(String id) {
		if (id.length() == 0) {
			id += "a";
		}
		return id;
	}

	private static String rule4(String id) {
		if (id.startsWith(".")) {
			id = id.substring(1, id.length());
		} else if (id.endsWith(".")) {
			id = id.substring(0, id.length() - 1);
		}
		return id;
	}

	private static String rule3(String id) {
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
		return id;
	}

	private static String rule2(String new_id, String id) {
		for (int i = 0; i < new_id.length(); i++) {
			char ch = new_id.charAt(i);

			// 이 조건에 부합 한것만 추가 하기에 다른것은 다 제거.
			if (ch >= 'a' && ch <= 'z') {
				id += String.valueOf(ch);
			// a보다 크거나 같다 존속, z보다 작거나 같다 존속
			} else if (ch >= '0' && ch <= '9') {
				id += String.valueOf(ch);
			// ch 0 보다 크거나 같다 존속, ch 9보가 작거나 같다 존속
			} else if (ch == '.' || ch == '-' || ch == '_') {
				id += String.valueOf(ch);
			// 마침표, -, _ 다 가능 (추가)
			}
		}
		return id;
	}
}
