package java18;

import java.util.HashSet;

public class SetTest2 {

	//HashSet: 순서 x 중복 x
	public static void main(String[] args) {
		HashSet set1 = new HashSet();
		set1.add("사과");
		set1.add("우유");
		set1.add("바나나");
		HashSet set2 = new HashSet();
		set2.add("빵");
		set2.add("요플레");
		set2.add("아이스크림");
		set1.addAll(set2);
		System.out.println(set1);
		System.out.println(set2);
	
		set2.clear();
		System.out.println(set2);
		
		
//		team.add("디자이너");
//		team.add("프로그래머");
//		team.add("DB관리자");
//		
//		System.out.println(team);
//		
//		System.out.println("팀에 디자이너가 있나요?"+team.contains("디자이너"));
		
	}
}
