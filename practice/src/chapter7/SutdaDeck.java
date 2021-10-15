package chapter7;

public class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	
	
	public SutdaDeck() {
		
		//1. 중첩문을 통해 1~20이 1~10, 1~10 쌍으로 나오도록
		for(int i = 0; i < cards.length; i++){
			int put = i % 10 + 1;
			
		// validation check 필수.
			boolean Kwang = (i<10) && (put == 1 || put == 3 || put == 8);
			
			cards[i] = new SutdaCard(put, Kwang);	
		}			
	}// end SutdaDeck
	
	
	
	// 7-2 문제도 같이 풀기
	// 1. Shuffle 메서드 추가, 2. pick 메서드 추가 3. pick 오버 로딩
	
	public void Shuffle() {
		// 1. 담을곳 선언
		SutdaCard tmp;
		
		for(int i = 0; i < cards.length; i++) {
			int j = (int)(Math.random() * (CARD_NUM));
			
			tmp = cards[j];
			cards[j] = cards[i];
			cards[i] = tmp;
		}
		
	}
	
	public SutdaCard pick(int index) {
		if(0 > index || index > 20 ) {
			return null;
		}else {
			return cards[index];
		}		
	}
	
	public SutdaCard pick(){
		
		int j = (int)(Math.random() * (CARD_NUM));
		
		
		return cards[j];		
	}
	
}
