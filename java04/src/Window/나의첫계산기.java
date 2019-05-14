package Window;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 나의첫계산기 {
	private static JTextField n1;
	private static JTextField n2;

	public static void main(String[] args) {

		JFrame f = new JFrame("나의 계산기");
		f.getContentPane().setBackground(Color.WHITE);
		f.setSize(423,400);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel label = new JLabel("<<<나의 계산기>>>");
		label.setBackground(Color.BLUE);
		label.setForeground(Color.GREEN);
		label.setFont(new Font("굴림", Font.PLAIN, 43));
		f.getContentPane().add(label);
		
		JLabel lblNewLabel = new JLabel("숫자1>>");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 35));
		f.getContentPane().add(lblNewLabel);
		
		n1 = new JTextField();
		n1.setBackground(Color.YELLOW);
		n1.setForeground(Color.BLUE);
		n1.setFont(new Font("굴림", Font.PLAIN, 28));
		f.getContentPane().add(n1);
		n1.setColumns(10);
		
		JLabel label_1 = new JLabel("숫자2>>");
		label_1.setForeground(Color.BLUE);
		label_1.setFont(new Font("굴림", Font.PLAIN, 35));
		f.getContentPane().add(label_1);
		
		n2 = new JTextField();
		n2.setForeground(Color.BLUE);
		n2.setFont(new Font("굴림", Font.PLAIN, 28));
		n2.setColumns(10);
		n2.setBackground(Color.YELLOW);
		f.getContentPane().add(n2);
		
		JButton b = new JButton("+");
		b.setFont(new Font("굴림", Font.PLAIN, 22));
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1= n1.getText();
				String num2= n2.getText();
				
				int number1 =Integer.parseInt(num1);
				int number2 =Integer.parseInt(num2);
				
				System.out.println(number1+number2);
			}
		});
		f.getContentPane().add(b);
		
		JButton button = new JButton("-");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1= n1.getText();
				String num2= n2.getText();
				
				int number1 =Integer.parseInt(num1);
				int number2 =Integer.parseInt(num2);
				
				System.out.println(number1-number2);
			}
		});
		button.setFont(new Font("굴림", Font.PLAIN, 22));
		f.getContentPane().add(button);
		
		JButton button_1 = new JButton("*");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1= n1.getText();
				String num2= n2.getText();
				
				int number1 =Integer.parseInt(num1);
				int number2 =Integer.parseInt(num2);
				
				System.out.println(number1*number2);
			}
		});
		button_1.setFont(new Font("굴림", Font.PLAIN, 22));
		f.getContentPane().add(button_1);
		
		JButton btnNewButton = new JButton("/");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1= n1.getText();
				String num2= n2.getText();
				
				int number1 =Integer.parseInt(num1);
				int number2 =Integer.parseInt(num2);
				
				System.out.println(number1/number2);
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 22));
		f.getContentPane().add(btnNewButton);
		
		
		
		
		f.setVisible(true);
	}

}
