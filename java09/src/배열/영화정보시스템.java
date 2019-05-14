package 배열;

import java.awt.FlowLayout;
import java.io.File;
import java.net.URL;
import java.sql.PreparedStatement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 영화정보시스템 {

	public static void main(String[] args) {
		String[] movies = {"m1.PNG", "m2.PNG", "m3.PNG", "m4.PNG", "m5.PNG"};
		//자바는 필요한 부분의 부품(class)을 복사해서
		//조립해서 코딩하는 방식
		//부품(객체, 대상)조립식 프로그램
		//객체지향형 프로그램(object-oriented program, OOP)
		
		//Color.red :static(정적)
		//new Button : instance
		
		JFrame f = new JFrame();
		f.setTitle("나의 영화 정보 시스템");
		f.setSize(300,600);
		//물흐르듯이 하나씩 순서대로 붙여주는 클래스
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		JButton img = new JButton();
		f.getContentPane().add(img);
		ImageIcon icon = new ImageIcon(movies[0]);
		img.setIcon(icon);
		
		JButton b1 = new JButton("<<생일>>");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon(movies[0]);
				img.setIcon(icon);
			}
		});
		b1.setFont(new Font("굴림", Font.PLAIN, 28));
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("<<헬보이>>");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon(movies[4]);
				img.setIcon(icon);
			}
		});
		
		b2.setFont(new Font("굴림", Font.PLAIN, 28));
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton("<<돈>>");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon(movies[2]);
				img.setIcon(icon);
			}
		});
		b3.setFont(new Font("굴림", Font.PLAIN, 28));
		f.getContentPane().add(b3);
		
		JButton b4 = new JButton("<<피트>>");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon(movies[3]);
				img.setIcon(icon);
			}
		});
		b4.setFont(new Font("굴림", Font.PLAIN, 28));
		f.getContentPane().add(b4);
		
		JButton b5 = new JButton("<<어스>>");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon(movies[1]);
				img.setIcon(icon);
			}
		});
		b5.setFont(new Font("굴림", Font.PLAIN, 28));
		f.getContentPane().add(b5);
		
		//객체화를 해주어야 String을 의미있게 인식한다.
		/*URL url = new URL("http://www.naver.com");
		File name = new File("c:/temp/test.txt");
		PreparedStatement sql = new PreparedStatement("select * from member");
		*/
		f.setVisible(true);
	}

}
