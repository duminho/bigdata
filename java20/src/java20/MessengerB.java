package java20;

import java.awt.BorderLayout;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class MessengerB extends JFrame{

	JTextArea list;
	JTextField input;
	DatagramSocket socket;
	
	public MessengerB() throws Exception {
		
		socket = new DatagramSocket(6000); //소켓 port같은 연결점
		list = new JTextArea(10,30); // 알리텍스트
		list.setFont(new Font("Monospaced", Font.PLAIN, 18));
		list.setBackground(Color.PINK);
		input = new JTextField(); //입력 테스트
		input.setFont(new Font("굴림", Font.PLAIN, 18));
		input.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = input.getText();
				//System.out.println("내가 입력한 값: "+data);
				list.append("내가 입력>>" + str + "\n");
				input.setText("");
				
				DatagramSocket socket;
				try {
					socket = new DatagramSocket();
					//소켓으로 패킷을 전송한다.
					
					byte[] data = str.getBytes();
					InetAddress ip = InetAddress.getByName("192.168.0.150");
					DatagramPacket packet 
					= new DatagramPacket(data, data.length, ip, 5000);
					
					socket.send(packet);
					socket.close();
				} catch (Exception e1) {
					System.out.println("받는데 문제생김");
				}
			}
		});
		input.setBackground(Color.BLUE);
		setTitle("메신저 B 채팅화면");
		getContentPane().add(list, BorderLayout.CENTER);
		getContentPane().add(input, BorderLayout.SOUTH);
		pack();
		list.setEditable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
	}
	public void process() throws Exception {
		//패킷 받는 코드(무한루프)
		while(true) {
			byte[] data= new byte[256];
			DatagramPacket packet = new DatagramPacket(data,data.length);
			socket.receive(packet);
			list.append("네가 입력<<"+ new String(data)+ "\n");
		}	
	}
	public static void main(String[] args) throws Exception {
		MessengerB name = new MessengerB();
		name.process();//보내기전에 받는 코드가 먼저 돌아가야함	
	}

}
