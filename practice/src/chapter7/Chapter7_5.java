package chapter7;

public class Chapter7_5 {

	public static void main(String[] args) {
		MyTv tv1 = new MyTv();
	
		
		tv1.setChannel(10);
		System.out.println("1.CH : " + tv1.getChannel());
		tv1.setChannel(20);
		System.out.println("2.CH : " + tv1.getChannel());
		tv1.goToPrevChannel();
		System.out.println("1.prevCH : " + tv1.getChannel());
		tv1.goToPrevChannel();
		System.out.println("2.prevCH : " + tv1.getChannel());
		

	}

}
