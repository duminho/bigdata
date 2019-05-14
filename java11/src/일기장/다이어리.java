package 일기장;

import java.awt.FlowLayout;
import java.awt.Font;
import java.io.FileWriter;

import javax.imageio.IIOException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 다이어리 {
	private JTextField t1;
	private JTextField t2;

	public 다이어리(){
		
		
		JFrame f = new JFrame("나의 일기장 작성 화면");
		f.getContentPane().setBackground(Color.GREEN);
		f.setForeground(Color.BLACK);
		f.setBackground(Color.BLACK);
		f.getContentPane().setForeground(Color.BLACK);
		f.setSize(600,700);
		JLabel l = new JLabel("일기장 작성 시작....");
		f.getContentPane().add(l);
		
		
		f.getContentPane().setLayout(null);
		
		JLabel la1 = new JLabel("<<<<일기작성날짜>>>>");
		la1.setFont(new Font("굴림", Font.PLAIN, 22));
		la1.setBounds(40, 13, 250, 45);
		f.getContentPane().add(la1);
		
		t1 = new JTextField();
		t1.setBackground(Color.YELLOW);
		t1.setBounds(302, 19, 250, 40);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel la2 = new JLabel("<<<<일기작성제목>>>>");
		la2.setFont(new Font("굴림", Font.PLAIN, 22));
		la2.setBounds(40, 79, 250, 45);
		f.getContentPane().add(la2);
		
		t2 = new JTextField();
		t2.setBackground(Color.YELLOW);
		t2.setBounds(302, 85, 250, 40);
		f.getContentPane().add(t2);
		t2.setColumns(10);
		
		JLabel la3 = new JLabel("<<<<일기작성내용>>>>");
		la3.setFont(new Font("굴림", Font.PLAIN, 22));
		la3.setBounds(165, 134, 250, 45);
		f.getContentPane().add(la3);
		
		JTextArea t3 = new JTextArea();
		t3.setBackground(Color.YELLOW);
		t3.setBounds(40, 187, 499, 325);
		f.getContentPane().add(t3);
		
		JButton b1 = new JButton("파일에 저장하기");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=t1.getText();
				String tile=t2.getText();
				String wi=t3.getText();
				
				try {
					파일 save = new 파일(name,tile,wi);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		b1.setForeground(Color.WHITE);
		b1.setBackground(Color.RED);
		b1.setFont(new Font("굴림", Font.PLAIN, 26));
		b1.setBounds(141, 538, 250, 50);
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("파일에서 읽어오기");
		b2.setForeground(Color.WHITE);
		b2.setBackground(Color.BLUE);
		b2.setFont(new Font("굴림", Font.PLAIN, 26));
		b2.setBounds(141, 598, 250, 50);
		f.getContentPane().add(b2);

			
		f.setVisible(true);
	}
}
