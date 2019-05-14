package Window;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 연습2 {
	private static JTextField n1;
	private static JTextField n2;
	private static JTextField n3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame("나의 두번째 계산기");
		f.setSize(500,400);
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		
		JLabel lblNewLabel = new JLabel("나의 두번째 계산기");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 43));
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("숫자1 >>");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 30));
		f.getContentPane().add(lblNewLabel_1);
		
		n1 = new JTextField();
		n1.setFont(new Font("굴림", Font.PLAIN, 30));
		f.getContentPane().add(n1);
		n1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("숫자2 >>");
		lblNewLabel_2.setFont(new Font("굴림", Font.PLAIN, 30));
		f.getContentPane().add(lblNewLabel_2);
		
		n2 = new JTextField();
		n2.setFont(new Font("굴림", Font.PLAIN, 30));
		f.getContentPane().add(n2);
		n2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("연산자    ");
		lblNewLabel_3.setFont(new Font("굴림", Font.PLAIN, 30));
		f.getContentPane().add(lblNewLabel_3);
		
		n3 = new JTextField();
		n3.setFont(new Font("굴림", Font.PLAIN, 30));
		f.getContentPane().add(n3);
		n3.setColumns(10);
		
		JButton btnNewButton = new JButton("계산하기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String num1 = n1.getText();
				String num2 = n2.getText();
				String num3 = n3.getText();
				
				int number1 = Integer.parseInt(num1);
				int number2 = Integer.parseInt(num2);
				
				int i=0;
				
				switch(num3){
				case "+": i = number1+number2; break;
				case "-": i = number1-number2; break;
				case "*": i = number1*number2; break;
				case "/": i = number1/number2; break;
				default: System.out.println("연산 할 수 없습니다.");
				}
				System.out.println("두 수의 연산값은 "+i+"입니다.");
				
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 24));
		f.getContentPane().add(btnNewButton);
		
		
		
		
		
		f.setVisible(true);
		
	}

}
