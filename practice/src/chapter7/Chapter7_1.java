package chapter7;

public class Chapter7_1 {
	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		
		System.out.println("pick(n) : " + deck.pick(1));
		System.out.println("pick() : " + deck.pick());
		deck.Shuffle();
		
		for(int i = 0; i < deck.cards.length; i++) {
			System.out.println(deck.cards[i] + ",");
		}
		
		
		
	}
	
}
