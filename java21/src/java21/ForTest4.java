package java21;

public class ForTest4 extends Thread{
	
	@Override
	public void run() {//동시에 처리되게 하고 싶은 내용을 이 메소드에 구현
		for (int i = 1; i <= 100; i++) {
			System.out.println("증가:"+i);
		}
	}
	
}
