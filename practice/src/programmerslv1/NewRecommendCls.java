package programmerslv1;

class NewRecommendCls {
	String id;

	public NewRecommendCls() {
		super();
	}
	
	public NewRecommendCls(String id) {
		this.id = id;
	}
	
	//1번 규칙 소문자로
	public NewRecommendCls replaceToLowerCase() {
		id = id.toLowerCase();
		return this;
	}
	
	//2번 규칙 알파벳, 숫자, ., _, - 제외 다 없애기
	public NewRecommendCls filter() {
		id = id.replaceAll("[^-_.a-z0-9]", "");
		return this;
	}
	
	//3번 규칙 중첩된 .를 하나로
	public NewRecommendCls toSingleDot() {
		id = id.replaceAll("[.]{2,}", ".");	
		return this;
	}
	
	//4번 규칙 처음. 과 끝. 일때 삭제해돌라
	public NewRecommendCls noStartEndDot() {
		id = id.replaceAll("^[.]|[.]$", "");
		
		return this;
	}
	
	//5번 규칙 만약 비어 있다면 a를 추가해돌라 아니면 id리턴
	public NewRecommendCls noBlank() {
		id = id.isEmpty() ? "a" : id;

		return this;
	}
	
	//6번 규칙 16이상이면 15로 바꿔돌라.
	public NewRecommendCls noMuchThen16() {
		if(id.length() >= 16) {
			id = id.substring(0, 15);
		}
		
		id = id.replaceAll("[.]$", "");
		
		return this;
	}
	
	//7번 규칙 id가 2자 이하라면 3이댈때까지 뒷자리를 그대로 복사해서 붙여달라.
	public NewRecommendCls noLessThan2() {
		String last = id.charAt(id.length() - 1) + "";
				
		
		if (id.length() == 2) {
			id = id + last;
		} else if (id.length() == 1) {
			id = id + last + last;
		}
		
		
		
//		StringBuilder sBuilder = new StringBuilder();
//		while (sBuilder.length() <= 2) {
//            sBuilder.append(sBuilder.charAt(sBuilder.length() - 1));
//        }
//        id = sBuilder.toString();
        return this;
	}
	
	public String getResult() {
		return id;
	}
}
