package string테스트;

import java.util.Random;

public class MathTest {

	public static void main(String[] args) {
		System.out.println(Math.random());
		int num = (int)(Math.random()+10);
		System.out.println(num);
		
		double num2 =12345.6789;
		System.out.println(Math.ceil(num2));	//무조건 올리는 메소드
		System.out.println(Math.floor(num2));	//무조건 내리는 메소드
		System.out.println(Math.round(num2));	//반올림 메소드
		
		final double NUM =1000;
//		NUM =100; //변경불가.
		//상수는 한번 넣어두고 변하지 않아야 하는
		//데이터를 넣어둘 때 사용.
		//상수는 final을 키워드를 사용.
		//상수에 들어간 데이터는 변경 불가
		//일반 변수와 비교하기 위해 대문자로 써두는 것이 일반적
		//final이 붙으면 종단 클래스, 더이상 상속 받을수 없다
		
		int num3 = -100;
		System.out.println(Math.abs(num3));	//절대값
		
		int num4 = -200;
		System.out.println(Math.max(num3, num4)); // 최대값
		System.out.println(Math.min(num3, num4)); // 최소값
		
		int num5 = 3;
		System.out.println(Math.pow(num5, 3)); //첫번째 인수를 두번째 인수 승하여 반환한다.
		
		Random r = new Random();
		r.setSeed(100); //(씨앗) 넣어둔 값에 맞춰서 랜덤값이 일정하게 나옴
		for (int i = 0; i < 10; i++) {
			System.out.println(r.nextInt(100));
		}
	}

}
