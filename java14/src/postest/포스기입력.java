package postest;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.FlowLayout;


public class 포스기입력 {

	public static void main(String[] args) throws Exception  {
		
		DB처리 db = new DB처리();
		db.table="member";
		
		MemberDTO dto = new MemberDTO();
		String num=JOptionPane.showInputDialog("원하는 타입 입력:");
		
		if(num.equals("입력")) {
			
			String number=JOptionPane.showInputDialog("NUMBER입력:");
			String name=JOptionPane.showInputDialog("NAME입력:");
			String id=JOptionPane.showInputDialog("ID입력:");
			String pw=JOptionPane.showInputDialog("PW입력:");
			String tel=JOptionPane.showInputDialog("TEL입력:");
			
			dto.setNumber(number);
			dto.setName(name);
			dto.setId(id);
			dto.setPw(pw);
			dto.setTel(tel);
				
			db.insert(dto);
			
		}
		else if(num.equals("변경")) {
		
			String value=JOptionPane.showInputDialog("Value입력:");
			String number=JOptionPane.showInputDialog("NUMBER입력:");
			db.update(value, number);
	
		}
		else if(num.equals("삭제")) {
			String number=JOptionPane.showInputDialog("NUMBER입력:");
			db.delete(number);
		
			
		}else if(num.equals("확인")) {
			
			String number=JOptionPane.showInputDialog("NUMBER입력:");
			String[] mem = db.select(number);
			for (String s : mem) {
				JOptionPane.showMessageDialog(null, s);
			}
			
		}
		
	}

}
