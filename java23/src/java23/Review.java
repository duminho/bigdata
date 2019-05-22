package java23;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Review extends JFrame implements ActionListener{
	
	JButton b1,b2;
	public Review() {
		
		setSize(300,300);
		b1 = new JButton("1번");
		b2 = new JButton("2번");
		add(b1);
		add(b2);
		
		FlowLayout flow = new FlowLayout();
		setLayout(flow);
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Review re = new Review();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1) {
			System.out.println("1번입니다.");
		}else if(e.getSource() == b2) {
			System.out.println("2번입니다.");
		}
		
	}
}
