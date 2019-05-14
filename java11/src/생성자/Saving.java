package 생성자;

import java.util.Arrays;

public class Saving {
	
	String product ;
	String name ;
	int money ;
	
	public Saving(String product, String name, int money) {
		
		this.product = product;
		this.name = name;
		this.money = money;
	}

	public int add(int x,int y,int z) {
		return x+y+z;
	}
	@Override
	public String toString() {
		return product + "\t" + name + "\t" + money+"만원";
	}
	
}
