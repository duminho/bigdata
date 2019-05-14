package JDBC;

import javax.swing.JOptionPane;

public class DB입력2 {

	public static void main(String[] args) {
		
		String id=JOptionPane.showInputDialog("ID입력:");
		String pw=JOptionPane.showInputDialog("PW입력:");
		String name=JOptionPane.showInputDialog("NAME입력:");
		String tel=JOptionPane.showInputDialog("TEL입력:");
		
		DB처리 db = new DB처리();
//		try {
//			db.update(tel, id);
//		} catch (Exception e) {
//			System.out.println("에러발생!!에러발생!!");
//			e.printStackTrace();
//		}
		try {
			db.delete(id);
		} catch (Exception e) {
			System.out.println("에러발생!!에러발생!!");
			e.printStackTrace();
		}
//		try {
//			db.insert(id, pw, name, tel);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
	}

}
