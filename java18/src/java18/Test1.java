package java18;

import java.util.HashMap;

public class Test1 {

	public static void main(String[] args) {
		HashMap system = new HashMap();
		system.put(1, "김데이");
		system.put(2, "김사전");
		system.put(3, "김구조");
		system.put(4, "김자료");
		for (int i = 0; i < system.size(); i++) {
			System.out.println((1+i)*100+"번은 "+system.get(i+1));
		}
	}

}
