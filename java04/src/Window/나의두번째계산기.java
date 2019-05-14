package Window;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class 나의두번째계산기 {
	private static JTextField textField;
	private static JTextField n1;
	private static JTextField n2;
	private static JTextField n3;

	public static void main(String[] args) {
		
		
		JFrame f = new JFrame("나의 두번째 계산기");
		f.setSize(461,400);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("<<<나의 두번째 계산기>>>");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 34));
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("숫자1 >>");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 26));
		f.getContentPane().add(lblNewLabel_1);
		
		n1 = new JTextField();
		n1.setFont(new Font("굴림", Font.PLAIN, 26));
		f.getContentPane().add(n1);
		n1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("숫자2 >>");
		lblNewLabel_2.setFont(new Font("굴림", Font.PLAIN, 26));
		f.getContentPane().add(lblNewLabel_2);
		
		n2 = new JTextField();
		n2.setFont(new Font("굴림", Font.PLAIN, 26));
		f.getContentPane().add(n2);
		n2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("연산자>>");
		lblNewLabel_3.setFont(new Font("굴림", Font.PLAIN, 26));
		f.getContentPane().add(lblNewLabel_3);
		
		n3 = new JTextField();
		n3.setFont(new Font("굴림", Font.PLAIN, 26));
		f.getContentPane().add(n3);
		n3.setColumns(10);
		
		JButton b = new JButton("계산하기");
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String num1 = n1.getText();
				String num2 = n2.getText();
				String s1 = n3.getText();
				
				int number1 =Integer.parseInt(num1);
				int number2 =Integer.parseInt(num2);
				
				if(s1.equals("+")) {
					System.out.println(number1+number2);
				}
				if(s1.equals("-")) {
					System.out.println(number1-number2);
				}
				if(s1.equals("*")) {
					System.out.println(number1*number2);
				}
				if(s1.equals("/")) {
					System.out.println(number1/number2);
				}
				
			}
		});
		b.setFont(new Font("굴림", Font.PLAIN, 30));
		f.getContentPane().add(b);
		
	
		
		
		
		
		f.setVisible(true);
	}

}
