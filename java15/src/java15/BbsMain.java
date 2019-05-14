package java15;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import postest.DB처리;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class BbsMain {
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;
	private JTextField t5;

	public BbsMain(){
		JFrame f = new JFrame("나의 게시판 만들기");
		f.setSize(400,800);
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		
		JLabel label = new JLabel("<아이디>");
		label.setFont(new Font("굴림", Font.PLAIN, 38));
		f.getContentPane().add(label);
		
		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.PLAIN, 32));
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("<제목>");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 38));
		f.getContentPane().add(lblNewLabel);
		
		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.PLAIN, 32));
		f.getContentPane().add(t2);
		t2.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("<내용>");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 38));
		f.getContentPane().add(lblNewLabel_1);
		
		t3 = new JTextField();
		t3.setFont(new Font("굴림", Font.PLAIN, 32));
		f.getContentPane().add(t3);
		t3.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("<기타>");
		lblNewLabel_2.setFont(new Font("굴림", Font.PLAIN, 38));
		f.getContentPane().add(lblNewLabel_2);
		
		t4 = new JTextField();
		t4.setFont(new Font("굴림", Font.PLAIN, 32));
		f.getContentPane().add(t4);
		t4.setColumns(10);
		
		JLabel label_1 = new JLabel("<입력>");
		label_1.setFont(new Font("굴림", Font.PLAIN, 38));
		f.getContentPane().add(label_1);
		
		t5 = new JTextField();
		t5.setFont(new Font("굴림", Font.PLAIN, 32));
		f.getContentPane().add(t5);
		t5.setColumns(10);
		
		JButton btnNewButton = new JButton("BBS 입력");
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 28));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				BbsDAO dao = new BbsDAO();
				BbsDTO dto = new BbsDTO();
				
				String num = t5.getText();
				if(num.equals("입력")) {
					String id=t1.getText();
					String title=t2.getText();
					String content=t3.getText();
					String etc=t4.getText();
					
					dto.setId(id);
					dto.setTitle(title);
					dto.setContent(content);
					dto.setEtc(etc);
					
					try {
						dao.insert(dto);
					} catch (Exception e1) {
						System.out.println("에러발생!!에러발생!!");
					}
					
				}else if(num.equals("변경")) {
					String id = t1.getText();
					String etc = t4.getText();
					try {
						dao.update(etc, id);
					} catch (Exception e1) {
						System.out.println("에러발생!!에러발생!!");
					}
					
				}
				else if(num.equals("삭제")) {
					String id = t1.getText();
					try {
						dao.delete(id);
					} catch (Exception e1) {
						System.out.println("에러발생!!에러발생!!");
					}
					
				}else if(num.equals("확인")) {
					String inputId = t1.getText();
					dto = dao.select(inputId);
					String id=dto.getId();
					String Title=dto.getTitle();
					String content=dto.getContent();
					String etc=dto.getEtc();
					t1.setText(id);
					t2.setText(Title);
					t3.setText(content);
					t4.setText(etc);
				}
			}
		});
		
		f.getContentPane().add(btnNewButton);
		
		f.setVisible(true);
	}
	public static void main(String[] args) {
		BbsMain name = new BbsMain();
	}

}
