package 일과;

public class 회사 {

	public static void main(String[] args) {
		Clock cl = new Clock(500,"김씨",10,"삼성");
		Clock cl1 = new Clock(600,12,"현대");
		Clock cl2 = new Clock(700,"LG");
		
		System.out.println("첫번째 회사 이름:"+cl.getcompany()+" 가격:"+cl.getprice());
		System.out.println("두번째 회사 이름:"+cl1.getcompany()+" 가격:"+cl1.getprice());
		System.out.println("세번째 회사 이름:"+cl2.getcompany()+" 가격:"+cl2.getprice());
	}

}
