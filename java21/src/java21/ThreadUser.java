package java21;

public class ThreadUser {

	public static void main(String[] args) {
		ForTest1 t1 = new ForTest1(); //스레드 객체 생성
		ForTest2 t2 = new ForTest2();
		ForTest3 t3 = new ForTest3();
		
		t1.start(); // 대기 상태임
		t2.start();
		t3.start();
		
		
	}

}
