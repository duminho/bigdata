package 일과;

public class 직원뽑기 {

	public static void main(String[] args) {
		
		Wk w1 = new Wk("김아무개", '남', 24);
		Wk w2 = new Wk("박아무개", '여', 23);
		Wk w3 = new Wk("정아무개", '남', 25);
		
		System.out.println("전체 직원의 수 "+Wk.count);
		System.out.println("직원들의 평균 나이 "+Wk.t/3);
		System.out.println("첫번째 직원의 이름은?"+w1.name);
	}

}
