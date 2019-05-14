package 부품만들기;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 중국집 {
	
	static int cnt=0;
	private static JTextField t1;
	private static JTextField t2;
	
	public static void main(String[] args) {
		
		String[] movies={"p2.jpg","p3.jpg","p4.jpg"};
		JButton[] buttons = new JButton[3];
		JFrame f = new JFrame();
		f.setTitle("중국집");
		f.setSize(800,700);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		buttons[0]=new JButton("짜장");
		buttons[1]=new JButton("우동");
		buttons[2]=new JButton("짬뽕");
		JButton img = new JButton();
		
		buttons[0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cnt+=1;
				ImageIcon icon = new ImageIcon(movies[0]);
				img.setIcon(icon);
				t1.setText(String.valueOf(cnt));
				t2.setText(String.valueOf(cnt*5000));
				}
		});
		f.getContentPane().add(buttons[0]);
		
		buttons[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cnt+=1;
				String num=Integer.toString(cnt);
				String num2=Integer.toString(cnt*5000);
				ImageIcon icon = new ImageIcon(movies[1]);
				img.setIcon(icon);
				t1.setText(num);
				t2.setText(num2);
			}
		});
		f.getContentPane().add(buttons[1]);
		
		buttons[2].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cnt+=1;
				String num=Integer.toString(cnt);
				String num2=Integer.toString(cnt*5000);
				ImageIcon icon = new ImageIcon(movies[2]);
				img.setIcon(icon);
				t1.setText(num);
				t2.setText(num2);
			}
		});
		f.getContentPane().add(buttons[2]);
		
		JLabel label = new JLabel("개수");
		f.getContentPane().add(label);
		
		t1 = new JTextField();
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel label_1 = new JLabel("금액");
		f.getContentPane().add(label_1);
		
		t2 = new JTextField();
		f.getContentPane().add(t2);
		t2.setColumns(10);
		
		ImageIcon icon = new ImageIcon("p1.jpg");
		f.getContentPane().add(img);
		img.setIcon(icon);
		
		f.setVisible(true);
	}

}
