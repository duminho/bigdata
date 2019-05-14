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

public class MyWindow {

	public static void main(String[] args) {
		//프레임
		JFrame f = new JFrame("입력값 받는 프로그램");
		f.setSize(326,319);
		
		//물흐르듯이 배치
		FlowLayout flow = new FlowLayout();
		JTextField text = new JTextField(20);
		JButton button = new JButton("나를 눌러요.");
		button.setBackground(Color.RED);
		button.setForeground(Color.GREEN);
		button.setFont(new Font("굴림", Font.PLAIN, 20));
		JLabel label = new JLabel("당신의 주요 프로그램 언어를 입력하세요.");
		label.setFont(new Font("굴림", Font.PLAIN, 15));
		label.setForeground(Color.BLUE);
		f.getContentPane().setLayout(flow);
		
		//버튼
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("버튼이 눌러졌군요..");
				String data = text.getText();
				System.out.println("당신의 주요 과목은:"+data);
			}
		});
		
		
		//글자들
		
		//입력받는 화면(한줄짜리)
		f.getContentPane().add(label);
		f.getContentPane().add(text);
		f.getContentPane().add(button);
		
		f.setVisible(true);
	}

}
