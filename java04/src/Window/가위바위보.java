package Window;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class 가위바위보 {
	private static JTextField n1;

	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		Random random = new Random();
		n1 = new JTextField();
		f.setSize(500,400);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton b1 = new JButton("가위");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int ran = random.nextInt(3);
				switch(ran) {
				case 0:n1.setText("무승부");
				case 1:n1.setText("졌다");
				case 2:n1.setText("이겼다");				
				}
			}
		});
		b1.setFont(new Font("굴림", Font.PLAIN, 66));
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("바위");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int ran = random.nextInt(3);
				switch(ran) {
				case 0:n1.setText("이겼다");
				case 1:n1.setText("무승부");
				case 2:n1.setText("졌다");				
				}
			}
		});
		b2.setFont(new Font("굴림", Font.PLAIN, 66));
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton("보");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int ran = random.nextInt(3);
				switch(ran) {
				case 0:n1.setText("졌다");
				case 1:n1.setText("이겼다");
				case 2:n1.setText("무승부");				
				}
			}
		});
		b3.setFont(new Font("굴림", Font.PLAIN, 66));
		f.getContentPane().add(b3);
		
		f.getContentPane().add(n1);
		n1.setColumns(10);
	
		
		
		
		
		
		f.setVisible(true);
		
	}

}
