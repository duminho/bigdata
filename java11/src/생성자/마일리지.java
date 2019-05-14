package 생성자;

public class 마일리지 {

	public static void main(String[] args) {
		
		Mile m1 = new Mile("admin", "1234", "관리자", 1000);
		Mile m2 = new Mile("manager", "pass", "준관리자", 1500);
		Mile m3 = new Mile("sitem", "sitepa", "준관리자", 1800);
		
		System.out.println("id\tpw\t등급\t마일리지");
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		
		System.out.println(m1.id+"의 비밀번호는 "+m1.pw+"입니다.");
		System.out.println(m2.id+"는 "+m2.rank+"입니다.");
		System.out.println("총 마일리지는 "+(m1.mile+m2.mile+m3.mile)+"입니다");
		System.out.println("평균 마일리지는 "+(m1.mile+m2.mile+m3.mile)/3+"입니다");
	}

}
