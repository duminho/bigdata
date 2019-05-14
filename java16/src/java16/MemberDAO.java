package java16;

import java.util.ArrayList;

public class MemberDAO {

	public ArrayList selectAll() {
		//dto를 3개를 만들어서 list로 묶으세요
		MemberDTO m1 = new MemberDTO("01","zxzx","1234");
		MemberDTO m2 = new MemberDTO("02","asas","1235");
		MemberDTO m3 = new MemberDTO("03","qwqw","1236");
		ArrayList list = new ArrayList();
		
		list.add(m1);
		list.add(m2);
		list.add(m3);
		
		//그 리스트를 리턴.
		return list;
	}

}
