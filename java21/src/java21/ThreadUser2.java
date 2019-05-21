package java21;

public class ThreadUser2 {

	public static void main(String[] args) {
		ForTest4 t1 = new ForTest4(); //스레드 객체 생성
		ForTest5 t2 = new ForTest5();
		
		t1.start(); // 대기 상태임
		t2.start();
		
		
	}

}
