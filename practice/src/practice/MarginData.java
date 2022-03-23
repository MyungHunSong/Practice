package practice;

public class MarginData {
	// 순이익
	int myMoney; //판매가 - (인건비 + 토지비 + 세금 + 재료비) 고정 : 인건비 토지비 재료
	// 마진률
	double perSent;
	// 판매가
	int salesratePrice;
	// 인건비
	int humanSpend;
	// 토지비
	int landPrice;
	// 세금
	int tax;
	// 재료비
	int foodPrice;
	
	// 1일 단위
	int oneDay;
	// 1년 단위
	int year;
	// 1일 순이익 (oneDaySalesRate = 순이익 * 판매량)
	int oneDaySalesRate;
	// 1년 순이익 (oneDay = (제품 종류당)순이익 * 판매량 * (365 - 쉬는날)) 
	//=> 사실 이건 [날짜] | [제품] | [판매량] | [순이익] 테이블로 구성가능 (mySql) 
	int yearSalesRate;
	
	// 매출액 (종류) 판매가 * 판매 갯수 = 하루 단위 매출액
	int totalSalesRate;
	
	//판매 갯수
	int howMuchSales; 
	
	
	public MarginData() {

	}
	
	public int getMyMoney() {
		int myMoney = salesratePrice - (humanSpend + landPrice + tax + foodPrice);;
		
		return myMoney; 
	}
	public void setMyMoney(int myMoney) {
		this.myMoney = myMoney;
	}
	public double getPerSent() {
		double value = ((double)myMoney/salesratePrice * 100);
		
		return  value;
	}
	public void setPerSent(double perSent) {
		this.perSent = perSent;
	}
	public int getSalesratePrice() {
		return salesratePrice;
	}
	public void setSalesratePrice(int salesratePrice) {
		this.salesratePrice = salesratePrice;
	}
	public int getHumanSpend() {
		return humanSpend;
	}
	public void setHumanSpend(int humanSpend) {
		this.humanSpend = humanSpend;
	}
	public int getLandPrice() {
		return landPrice;
	}
	public void setLandPrice(int landPrice) {
		this.landPrice = landPrice;
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	public int getFoodPrice() {
		return foodPrice;
	}
	public void setFoodPrice(int foodPrice) {
		this.foodPrice = foodPrice;
	}
	
	

	public int getOneDay() {
		return oneDay;
	}

	public void setOneDay(int oneDay) {
		this.oneDay = oneDay;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getOneDaySalesRate() {
		
		int oneDaySales = myMoney * howMuchSales;
		return oneDaySales;
	}

	public void setOneDaySalesRate(int oneDaySalesRate) {
		this.oneDaySalesRate = oneDaySalesRate;
	}

	public int getYearSalesRate() {
		
		return yearSalesRate = myMoney * howMuchSales * oneDay;
	}

	public void setYearSalesRate(int yearSalesRate) {
		this.yearSalesRate = yearSalesRate;
	}

	public int getTotalSalesRate() {
		return totalSalesRate = salesratePrice * howMuchSales * oneDay ;
	}

	public void setTotalSalesRate(int totalSalesRate) {
		this.totalSalesRate = totalSalesRate;
	}
	

	public int getHowMuchSales() {
		return howMuchSales;
	}

	public void setHowMuchSales(int howMuchSales) {
		this.howMuchSales = howMuchSales;
	}

	@Override
	public String toString() {
		return String.format(
				"MarginData [myMoney=%s, perSent=%s, salesratePrice=%s, humanSpend=%s, landPrice=%s, tax=%s, foodPrice=%s, oneDay=%s, year=%s, oneDaySalesRate=%s, yearSalesRate=%s, totalSalesRate=%s, howMuchSales=%s]",
				myMoney, perSent, salesratePrice, humanSpend, landPrice, tax, foodPrice, oneDay, year, oneDaySalesRate,
				yearSalesRate, totalSalesRate, howMuchSales);
	}

	

	
}
