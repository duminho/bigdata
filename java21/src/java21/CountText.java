package java21;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class CountText extends JFrame{
	
	private JLabel label1, label2;
	
	public CountText() {
		
		setTitle("카운트다운");
		setSize(800, 600);
		
		label1 = new JLabel("스타트");
		label2 = new JLabel();
		
		label1.setFont(new Font("굴림", Font.PLAIN, 70));
		label1.setForeground(Color.blue);
		label2.setFont(new Font("굴림", Font.PLAIN, 100));
		label2.setForeground(Color.blue);
		setLayout(new FlowLayout());
		
		add(label1);
		add(label2);
		
		(new CountThread()).start();
		(new ImageThread1()).start();
		
		setVisible(true);
	}
	class CountThread extends Thread{
		
		@Override
		public void run() {
			 for (int i = 500; i >= 0; i--) {
				 try {
	                 Thread.sleep(100);
	             } catch (InterruptedException e) {
	                 e.printStackTrace();
	             }
	              label1.setText(i +" ");
			 }
		}
		
	}
	class ImageThread1 extends Thread{
		@Override
		public void run() {
			String[] image= {"초원1.jpg","초원2.jpeg","초원3.jpg","초원4.jpg","초원5.jpg"
							,"초원6.jpg","초원7.jpg","초원8.jpg","초원9.jpeg","초원10.jpg"
			};
			
			
			ImageIcon icon1 = new ImageIcon(image[0]);
			label2.setIcon(icon1);
			
			for (int i = 1; i < image.length; i++) {
				try {
					Thread.sleep(1000);
					ImageIcon icon = new ImageIcon(image[i]);
					label2.setIcon(icon);
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		CountText name = new CountText();
	}
}
