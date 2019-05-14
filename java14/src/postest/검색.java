package postest;

import javax.swing.JOptionPane;

public class 검색 {

	public static void main(String[] args) throws Exception {
		
		DB처리 db = new DB처리();
		db.table="member";
		String number = JOptionPane.showInputDialog("NUMBER입력:");
		String name = JOptionPane.showInputDialog("NAME입력:");
		String id = JOptionPane.showInputDialog("ID입력:");
		String pw = JOptionPane.showInputDialog("PW입력:");
		String tel = JOptionPane.showInputDialog("TEL입력:");
		MemberDTO dto = new MemberDTO();
		
		dto.setNumber(number);
		dto.setName(name);
		dto.setId(id);
		dto.setPw(pw);
		dto.setTel(tel);
		
		db.insert(dto);
//		String[] mem = db.select(id);
//		for (String s : mem) {
//			JOptionPane.showMessageDialog(null, s);
//		}
		
		//select * form member where id=?
	}

}
