package car;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class CarUser {
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;

	public CarUser() {

		JFrame f = new JFrame();
		f.setSize(800,800);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel.setBounds(111, 83, 132, 39);
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setBounds(251, 83, 328, 39);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel label = new JLabel("이름");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("굴림", Font.PLAIN, 20));
		label.setBounds(111, 141, 132, 39);
		f.getContentPane().add(label);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(251, 141, 328, 39);
		f.getContentPane().add(t2);
		
		JLabel label_1 = new JLabel("사이즈");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("굴림", Font.PLAIN, 20));
		label_1.setBounds(111, 205, 132, 39);
		f.getContentPane().add(label_1);
		
		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(251, 205, 328, 39);
		f.getContentPane().add(t3);
		
		JLabel label_2 = new JLabel("가격");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("굴림", Font.PLAIN, 20));
		label_2.setBounds(111, 267, 132, 39);
		f.getContentPane().add(label_2);
		
		t4 = new JTextField();
		t4.setColumns(10);
		t4.setBounds(251, 267, 328, 39);
		f.getContentPane().add(t4);
		
		JButton b1 = new JButton("입력");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CarDTO dto = new CarDTO();
				CarDAO dao = new CarDAO();
				
				String id = t1.getText();
				String name = t2.getText();
				String content = t3.getText();
				String price = t4.getText();
				
				dto.setId(id);
				dto.setName(name);
				dto.setContent(content);
				dto.setPrice(price);
				
				try {
					dao.insert(dto);
				} catch (Exception e1) {
					System.out.println("에러발생");	
				}
			}
		});
		b1.setFont(new Font("굴림", Font.PLAIN, 20));
		b1.setBounds(195, 334, 328, 47);
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("확인");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CarDTO dto = new CarDTO();
				CarDAO dao = new CarDAO();
				
				String inputid = t1.getText();
				
				try {
					dto=dao.select(inputid);
					String id=dto.getId();
					String name=dto.getName();
					String content=dto.getContent();
					String price=dto.getPrice();
					
					System.out.println("ID :"+id);
					System.out.println("Name :"+name);
					System.out.println("Content :"+content);
					System.out.println("Price :"+price);
					
				} catch (Exception e1) {
					System.out.println("에러발생");	
				}
				
			}
		});
		b2.setFont(new Font("굴림", Font.PLAIN, 20));
		b2.setBounds(195, 396, 328, 47);
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton("변경");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CarDTO dto = new CarDTO();
				CarDAO dao = new CarDAO();
				
				String id = t1.getText();
				String price = t4.getText();
				
				try {
					dao.update(price, id);
				} catch (Exception e1) {
					System.out.println("에러발생");
				}
				
			}
		});
		b3.setFont(new Font("굴림", Font.PLAIN, 20));
		b3.setBounds(195, 457, 328, 47);
		f.getContentPane().add(b3);
		
		JButton b4 = new JButton("삭제");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CarDTO dto = new CarDTO();
				CarDAO dao = new CarDAO();
				
				String id = t1.getText();
				
				dto.setId(id);
				try {
					dao.delete(id);
				} catch (Exception e1) {
					System.out.println("에러발생");
				}
			}
		});
		b4.setFont(new Font("굴림", Font.PLAIN, 20));
		b4.setBounds(195, 519, 328, 47);
		f.getContentPane().add(b4);
		
		JButton b5 = new JButton("전체 확인");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CarDAO dao = new CarDAO();
				ArrayList list = null;
				try {
					list = dao.selectAll();
					for (int i = 0; i < list.size(); i++) {
						CarDTO dto = (CarDTO)list.get(i);
						System.out.println("ID: "+dto.getId());
						System.out.println("Name: "+dto.getName());
						System.out.println("Content: "+dto.getContent());
						System.out.println("Price: "+dto.getPrice());
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		b5.setFont(new Font("굴림", Font.PLAIN, 20));
		b5.setBounds(195, 576, 328, 47);
		f.getContentPane().add(b5);
		
		
		
		f.setVisible(true);
	}
	public static void main(String[] args) {
		CarUser name = new CarUser();
	}
}
