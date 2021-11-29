package programmers;

public class NewRecommendCls {
	String new_id;

	public NewRecommendCls() {}

	public NewRecommendCls(String new_id) {
		super();
		this.new_id = new_id;
	}

	public String getNew_id() {
		return new_id;
	}

	public void setNew_id(String new_id) {
		
		
		new_id = new_id.toLowerCase(); //1번 규칙 대문자 -> 소문자
		
		String id = "";
		
		//2번 규칙 알파벳 소문자, 숫자, -, _, . 를 제외한 모든 문자를 제거
		for(int i = 0; i < id.length(); i++) {
			char j = id.charAt(i);
		
		// String.valueOf 는 null값이면 null값으로 무조건 String으로 찍어준다.	
			if('a' <= j && j <= 'z') {
				id += String.valueOf(j); 
			} else if ('0' <= j && j <= '9') {
				id += String.valueOf(j);
			} else if (j == '.' || j == '-' || j == '_') {
				id += String.valueOf(j);
			}
		}
		
		//3번 규칙 new_id에 마침표가 2번 이상 연속된 부분을 하나의 마침효로 치환
		for(int i = 0; i< id.length(); i++) {
			if(id.charAt(i) == '.') {
				int j = i + 1;
					
				// while문으로 풀이
			 String dot = ".";	
				while( j != id.length() && id.charAt(j) == '.') {
					dot += ".";
					j++;
				}
				
			/*String dot;
			for(dot = "."; (j != id.length() && id.charAt(j) == '.'); j++){
				dot += ".";
			}
			
			if(dot.length() >= 2) {
				id = id.replace(dot, ".");
			}
			
			}*/
			}
		}		
		
		//4번 규칙 첫번째, 마지막 . 제거
		// substring 문자열 자르기 substring(start) substring(start, end)
		if(id.startsWith(".")) {
			id = id.substring(1, id.length());
		}else if(id.endsWith(".")) {
			id = id.substring(0, id.length() - 1);
		}
		
		//5번 규칙 빈 문자열 이라면 a대입
		if(id.length() == 0) {
			id += "a";
		}
		
		//6번 규칙 16자 이상이면, 15자만 남김
		if(id.length() >= 16) {
			id = id.substring(0, 15);
		}
		
		//7번 규칙 2자 이하라면 마지막 문자 길이 3까지 반복해서 끝에 붙임
		String last = id.charAt(id.length() - 1) + "";
		if(id.length() == 2){
			id = id + last;
		} else if (id.length() == 1) {
			id = id + last + last;
		}
		
		this.new_id = id;
	}

	@Override
	public String toString() {
		return "NewRecommendCls [new_id=" + new_id + "]";
	}
	
	
}
