package java21;

public class Test2 extends Thread{
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.print("☆");
		}
	}
}
