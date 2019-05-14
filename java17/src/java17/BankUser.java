package java17;

public class BankUser{

	public static void main(String[] args) {
		BadBank bb = new BadBank();
		NormalBank nb = new NormalBank();
		GoodBank gb = new GoodBank();
		
		System.out.println("BadBank의 이자율"+bb.interest());
		System.out.println("NormalBank의 이자율"+nb.interest());
		System.out.println("GoodBank의 이자율"+gb.interest());
	}

}
