package java03;

import javax.swing.JOptionPane;

public class 다이얼로그2 {

	public static void main(String[] args) {
		
		String food1 = JOptionPane.showInputDialog("먹고싶은 음식을 입력하세요");
		String food2 = JOptionPane.showInputDialog("먹기싫은 음식을 입력하세요");
		JOptionPane.showMessageDialog(null, "당신이 먹고싶은 음식"+food1);
		JOptionPane.showMessageDialog(null, "당신이 먹기 싫은 음식"+food2);
	}

}
