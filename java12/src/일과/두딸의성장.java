package 일과;

public class 두딸의성장 {

	public static void main(String[] args) {
		
		Money m1 = new Money("김소율", 12, "아프리카보기");
		Money m2 = new Money("김서울", 11, "트위치보기");
		
		System.out.println("첫째딸의 이름은 "+m1.name+"이고, 나이는"+m1.age+"살이다");
		System.out.println("첫째딸의 이름은 "+m2.name+"이고, 나이는"+m2.age+"살이다");
	}

}
