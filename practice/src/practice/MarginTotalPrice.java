package practice;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MarginTotalPrice {
	public static void main(String[] args) {
		MarginData marginData = new MarginData();
		
		Scanner scan = new Scanner(System.in);
		
		int salesRatePrice = scan.nextInt();
		int howMuchSales = scan.nextInt();
		int oneDay = scan.nextInt();
		
		
		// 1. 매출액
		// 문제점 하루 단위 마다 판매량이 다르다. [판매량] | [순이익] | [매출액] 등등 일단 판매
		// 물품 종류도 다양하다.
		marginData.setSalesratePrice(salesRatePrice);
		marginData.setHowMuchSales(howMuchSales);
		marginData.setOneDay(oneDay);
		
		// 돈단위 ,찍어주기
		DecimalFormat dec = new DecimalFormat("###,###,###,###");
		String dec1 = dec.format(marginData.getTotalSalesRate());
		
		System.out.println("굴순두부 가격 : " + salesRatePrice);
		System.out.println("굴순두부 판매량 : " + howMuchSales);
		System.out.println("굴순두부 날짜 단위: " + oneDay);
		
		if(oneDay == 365) {
			System.out.println("1년 단위 굴 순두부 : " + dec1);
		}else {
			System.out.printf("굴 순두부 판매량 : %s%n날짜 단위 : %d일%n", dec1, oneDay );
		}
		scan.close();
		
		// 순이익
		// (굴 순두부) 하루 단위
		int humanSpend = 2000;
		int landPrice = 1000;
		int tax = 2000;
		int foodPrice = 1000;
		
		
		
		marginData.setHumanSpend(humanSpend);
		marginData.setLandPrice(landPrice);
		marginData.setTax(tax);
		marginData.setFoodPrice(foodPrice);
		marginData.setMyMoney(marginData.getMyMoney());
		marginData.setOneDaySalesRate(marginData.getOneDaySalesRate());
				
		System.out.printf("굴 순두부 순이익 : %d%n", marginData.getOneDaySalesRate());
		// (굴 순두부) 1년 
		System.out.printf("(하루 이상)굴 순두부 순이익 : %d%n", marginData.getYearSalesRate());
		
		
		System.out.println(marginData.toString());
		 
	}
}
