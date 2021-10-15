package chapter7;

public class Chapter7_4 {

	public static void main(String[] args) {
		MyTv t = new MyTv();
		
		t.setChannel(101);
		System.out.println("CH: " + t.getChannel());
		t.setVolume(10);
		System.out.println("Vol: " + t.getVolume());

	}

}
