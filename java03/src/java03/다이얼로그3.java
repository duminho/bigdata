package java03;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class 다이얼로그3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("오늘의 치킨 가격은 얼마인가요?");
		int b=sc.nextInt();
			
		if(b>=9000) {
			System.out.println("9000원을 넘으면 내일 주문할께요");				
		}else {
			System.out.println("한마리만 주세요");
		}
			
		}
		
}


