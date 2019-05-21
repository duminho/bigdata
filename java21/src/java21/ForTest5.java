package java21;

public class ForTest5 extends Thread{
	
	@Override
	public void run() {//동시에 처리되게 하고 싶은 내용을 이 메소드에 구현
		for (int i = 100; i <= 0; i--) {
			System.out.println("감소:"+i);
		}
	}
	
}
