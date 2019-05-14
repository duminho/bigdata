package 부품만들기;

public class 내방 {

	public static void main(String[] args) {
		Phone p1 = new Phone();
		p1.company="apple";
		p1.shape="네모";
		p1.size=50;
		
		System.out.println(p1.company);
		System.out.println(p1.shape);
		System.out.println(p1.size);
		p1.call();
		p1.text();
		p1.alarm();
		
		System.out.println("-------------");
		
		//class를 복사해서 만든 TV2를 객체(대상,object)
		//new의 역할 : 객체 생성
		//생성자 이용
		TV tv1 = new TV();
		tv1.color="검정색";
		tv1.power=true;
		tv1.size=50;
//		System.out.println(tv1.color);
//		System.out.println(tv1.power);
//		System.out.println(tv1.size);
		
		System.out.println(tv1);
	
	}
}

