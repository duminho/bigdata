package 일과;

public class Wk {
	String name;
	char gd;
	int age;
	static int count;
	static int t;
	public Wk() {
		
	}

	public Wk(String name, char gd, int age) {
		this.name = name;
		this.gd = gd;
		this.age = age;
		count++;
		t+=age;
	}

	@Override
	public String toString() {
		return "Wk [name=" + name + ", gd=" + gd + ", age=" + age + "]";
	}
	
	
	
}
