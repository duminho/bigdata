package java16;

import java.util.ArrayList;

public class ListTest3 {

	public static void main(String[] args) {
		//순서가 중요.
		ArrayList list = new ArrayList();
		list.add("김데이");
		list.add("김사전");
		list.add("김구조");
		list.add("김자료");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i+1)*100+"번의 고객은 "+list.get(i));
		}
		System.out.println("200번의 고객이 탈퇴했습니다.");
		list.remove(1);
		System.out.println("300번의 고객이 개명(김충성)");
		list.set(1, "김충성");
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i+1)*100+"번의 고객은 "+list.get(i));
		}
		
	}

}
