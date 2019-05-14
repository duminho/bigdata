package 일과;

public class Money {
	
	String name;
	int age;
	String doing;
	static int money=10000;
	
	public Money() {
		
	}

	public Money(String name, int age, String doing) {
		this.name = name;
		this.age = age;
		this.doing = doing;
		money-=1000;
	}

	
	
}
