package Window;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class MyWindow2 {

	public static void main(String[] args) {
		//프레임
		JFrame f = new JFrame("입력값 받는 프로그램");
		f.setSize(326,319);
		
		//물흐르듯이 배치
		FlowLayout flow = new FlowLayout();
		JTextField text = new JTextField(20);
		JButton button = new JButton("나를 눌러요.");
		JLabel label = new JLabel("당신의 주요 프로그램 언어를 입력하세요.");
		
		//버튼
		button.add(button);
		
		//글자들
		
		//입력받는 화면(한줄짜리)
		f.add(label);
		f.add(text);
		f.add(button);
		
		f.setVisible(true);
	}

}
