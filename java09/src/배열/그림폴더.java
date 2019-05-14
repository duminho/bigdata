package 배열;

import java.awt.FlowLayout;
import java.awt.image.ImagingOpException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 그림폴더 {

	static int a=1;
	
	public static void main(String[] args) {
		String[] movies={"시바1.jpg","시바2.jpg","시바3.jpg"};
		JFrame f = new JFrame();
		f.setTitle("시바견♡");
		f.setSize(800,700);
		f.getContentPane().setLayout(null);
		
		JButton img = new JButton();
		f.getContentPane().add(img);
		ImageIcon icon = new ImageIcon(movies[1]);
		img.setBounds(150, 150, 450, 450);
		img.setIcon(icon);
		
		/*JButton[] buttons = new JButton[2];
		buttons[0]= new JButton("왼쪽으로");
		buttons[1]= new JButton("오른쪽으로");
		
		buttons[0].setBounds(50, 50, 150, 100);
		f.getContentPane().add(buttons[0]);
		
		buttons[1].setBounds(700, 50, 150, 100);
		f.getContentPane().add(buttons[1]);*/
		
		JButton b1 = new JButton("왼쪽으로");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=a-1;
				if(a==-1) {
					a=0;
				}
				ImageIcon icon = new ImageIcon(movies[a]);
				img.setIcon(icon);
			}
		});
		b1.setFont(new Font("굴림", Font.PLAIN, 30));
		b1.setBounds(75, 39, 200, 98);
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("오른쪽으로");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=a+1;
				if(a==3) {
					a=2;
				}
				ImageIcon icon = new ImageIcon(movies[a]);
				img.setIcon(icon);
			}
		});
		b2.setFont(new Font("굴림", Font.PLAIN, 30));
		b2.setBounds(476, 39, 200, 98);
		f.getContentPane().add(b2);
		
		f.setVisible(true);
	}
}
