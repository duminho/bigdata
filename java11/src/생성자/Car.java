package 생성자;

public class Car {

	//정적속성
	String color;
	boolean convertible;
	
	
	
	//단축키:알트+쉬프트+s+o
	//파라메터 없는 생성자를 기본 생성자라 한다
	public Car() {
	}

	public Car(String color) {
		this.color = color;
	}

	public Car(String color, boolean convertible) {
		this.color = color;
		this.convertible = convertible;
	}
	//동적속성
	public void change() {
		System.out.println("기어를 바꾸다.");
	}
	public int speedUp(int nowSpeed) {
		return nowSpeed + 30;
	}
	
	//단축키:컨트롤+쉬프트+z
	@Override
	public String toString() {
		return "car [color=" + color + ", convertible=" + convertible + "]";
	}
}
