package 일기장;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class 파일다루기 {

	
	public 파일다루기() throws Exception{
		
		//파일의 저장
		//객체생성

		String num1=JOptionPane.showInputDialog("이름을 입력:");
		String num2=JOptionPane.showInputDialog("번호을 입력:");
		String content=JOptionPane.showInputDialog("주소을 입력:");
		
		FileWriter w = new FileWriter("txt");
		//메소드 사용(호출)
		
		
		w.write(num1 +"\n");
		w.write(num2 +"\n");
		w.write(content +".\n");
		
		w.close();
	
	}
}
