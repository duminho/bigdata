package java16;

import java.util.ArrayList;

public class MemberDAOUser {

	public static void main(String[] args) {
		//멤버리스트를 리턴받아
		MemberDAO dao = new MemberDAO();
		ArrayList list = dao.selectAll();
		
		//전체 출력
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			
			MemberDTO dto = (MemberDTO)list.get(i);
			System.out.println(dto.getNumber());
			System.out.println(dto.getId());
			System.out.println(dto.getPw());
			System.out.println();
		}
	}

}
