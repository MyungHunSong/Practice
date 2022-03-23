package practice;

import java.util.Scanner;

public class MarginRate {
	public static void main(String[] args) {
		// 마진 구하기
		// 1. 제품당 순수익 : 판매가 - (인건비 + 토지비 + 세금 + 재료비)
		// 2. 퍼센티 구하기 : 순수익 / 판매가 x 100
		MarginData marginData = new MarginData();
		
				
		int salesratePrice = 10000;
		int  humanSpend = 2500;
		int landPrice = 1000;
		int tax = 2000;
		int foodPrice = 500;
		
		marginData.setSalesratePrice(salesratePrice);
		marginData.setHumanSpend(humanSpend);
		marginData.setLandPrice(landPrice);
		marginData.setTax(tax);
		marginData.setFoodPrice(foodPrice);
		
		 System.out.println("myMoney : " + marginData.getMyMoney());
		
		// 순수익
		System.out.println("순수익? : " + marginData.getMyMoney());
		
		int nowMyMoney = marginData.getMyMoney();
		
		marginData.setMyMoney(nowMyMoney);
		
		System.out.println("현재 들어간 nowMyMoney : " + nowMyMoney);
		System.out.println("현재 들어간 salesratePrice : " + salesratePrice);
		System.out.println("여기선 된다 : " + ((double)nowMyMoney/salesratePrice * 100));
		// 퍼센트
		System.out.println("마진률? : " + marginData.getPerSent() + "%");
		
		
		
	
	}
}

