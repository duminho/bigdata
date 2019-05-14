package java18;

public class 형변환테스트1 {

	public static void main(String[] args) {
		//형변환(type change : 타입변환, casting, 캐스팅)
		//기초형 형(타입)변환
		//작->큰: 자동형변환
		byte a=127;
		int b=a;
		//큰->작: 강제형변환
		int c=127;
		byte d=(byte)c;
		
		//참조형 형변환(클래스의 형변환)
		//상속관계에 있는 클래스들만 형변환 가능
		//작(자식)->큰(부모):자동형변환
//		Car car = new Car();
//		Truck truck = new Truck();
//		car = truck;
//		//큰(부모)->작(자식):강제형변환
//		truck = (truck)car;//큰->작
		
	}

}
