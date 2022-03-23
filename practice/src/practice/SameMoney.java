package practice;

import java.util.Scanner;

public class SameMoney {
	public static void main(String[] args) {
		// 넣어둔 돈 1000 현금 500
		// 얼마를 넣어야지 똑같아 지나?

		int putMoney = 1000;
		int haveMoney = 500;
		// 들어갈 돈
		int a = 40;
		int b = 60;
		
		// for문을 통한 반복
		forMoon(putMoney, haveMoney, a, b);
		
		// while 문을 통한 무한반복
		whileMoon(putMoney, haveMoney, a, b);
		
		
		Scanner scan = new Scanner(System.in);
		int first = scan.nextInt();
		int second = scan.nextInt();
		System.out.println("first 값 입력 :" + first);
		System.out.println("second 값 입력 : " + second );
		
		int i =0;
		while(i<1000){
			int Money1 = first + (a * i);
			int Money2 = second + (b * i);
			
			if (Money1 == Money2) {
				
				System.out.printf("Scanner 주식에 들어간 돈 Money1(%d)%n 현금으로 보유한 돈 Money2(%d)%n 몆번 주입 : %d번%n ", Money1, Money2, i);

			}else if(first < second){
				System.out.println("first 돈이 second돈 보다 작을수 없습니다");
				Scanner scan1 = new Scanner(System.in);
				continue;
			}
			i++;
		}		
	}

	private static void whileMoon(int putMoney, int haveMoney, int a, int b) {
		int i =0;
		while(i<30) {
			int Money1 = putMoney + (a * i);
			int Money2 = haveMoney + (b * i);
			if (Money1 == Money2) {
				System.out.printf("WHILE 문 주식에 들어간 돈 Money1(%d)%n 현금으로 보유한 돈 Money2(%d)%n 몆번 주입 : %d번%n ", Money1, Money2, i);

			}
			i++;
		}
	}

	private static void forMoon(int putMoney, int haveMoney, int a, int b) {
		for (int i = 0; i <= 30; i++) {
			int Money1 = putMoney + (a * i);
			int Money2 = haveMoney + (b * i);
			

			if (Money1 == Money2) {
				int lastMoney = Money1 + Money2;
				System.out.printf("For 문 주식에 들어간 돈 Money1(%d)%n 현금으로 보유한 돈 Money2(%d)%n , 몆번 주입 : %d번%n, 합친돈 : %d%n ", Money1, Money2, i, lastMoney);

			} 

		}
	}
}
