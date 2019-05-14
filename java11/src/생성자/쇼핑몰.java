package 생성자;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class 쇼핑몰 {

	public static void main(String[] args) {
		
		String name;
		int age;
		String tel;
		String addr;
		Member[] mem = new Member[3];
		for (int i = 0; i < 3; i++) {
			
			name=JOptionPane.showInputDialog("가입할 이름");
			String num=JOptionPane.showInputDialog("가입할 나이");
			age=Integer.parseInt(num);
			tel=JOptionPane.showInputDialog("가입할 번호");
			addr=JOptionPane.showInputDialog("가입할 주소");
			
			mem[i]=new Member(name, age, tel, addr);
		}
		System.out.println("쇼핑몰 회원가입 명단");
		System.out.println("================================");
		System.out.println("이름\t나이\t번호\t주소");
		System.out.println("----------------------------------");
		for (int i = 0; i < 3; i++) {
			System.out.println(mem[i]);
		}
		
		
	}

}
