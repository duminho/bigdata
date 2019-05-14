package 일과;

public class Clock {

	int price;
	String name;
	int nowTime;
	String company;
	
	public Clock() {
	}

	public Clock(int price, String name, int nowTime, String company) {
		this.price = price;
		this.name = name;
		this.nowTime = nowTime;
		this.company = company;
	}

	public Clock(int price, int nowTime, String company) {
		this.price = price;
		this.nowTime = nowTime;
		this.company = company;
	}

	public Clock(int price, String company) {
		this.price = price;
		this.company = company;
	}
	
	public String getcompany() {
		return company;
	}
	public int getprice() {
		return price;
	}
	
	
	
	
}
