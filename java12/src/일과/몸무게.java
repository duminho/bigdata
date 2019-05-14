package 일과;

public class 몸무게 {

	public static void main(String[] args) {
		Person pe = new Person(180,80,"비밀1","주소1");
		
		System.out.println("당신의 몸무게:"+pe.getWeight());
		System.out.println("당신의 비밀:"+pe.getsecret());
		System.out.println("적정 몸무게"+pe.to());
	}

}
