package chapter7;

public class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	
	
	public SutdaDeck() {
		
		//1. ��ø���� ���� 1~20�� 1~10, 1~10 ������ ��������
		for(int i = 0; i < cards.length; i++){
			int put = i % 10 + 1;
			
		// validation check �ʼ�.
			boolean Kwang = (i<10) && (put == 1 || put == 3 || put == 8);
			
			cards[i] = new SutdaCard(put, Kwang);	
		}			
	}// end SutdaDeck
	
	
	
	// 7-2 ������ ���� Ǯ��
	// 1. Shuffle �޼��� �߰�, 2. pick �޼��� �߰� 3. pick ���� �ε�
	
	public void Shuffle() {
		// 1. ������ ����
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
