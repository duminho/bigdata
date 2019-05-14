package java03;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class 다이얼로그5 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		double pi=3.14;
		int r=12;
		int width=11, height=22;
				
		System.out.println("pi="+pi+", r="+r);
		System.out.println("원의 면적은 pi*r*r="+(pi*r*r));
		
		System.out.println("width="+width+ " height="+height);
		System.out.println("사각형의 면적은 " + (width * height));
		System.out.print("가로 세로가 같나요?");
		if(width == height) {
			System.out.println(true);
		}else {			
			System.out.println(false);
		}
		System.out.print("반지름이 10보다 큰가요?");
		if(r>10) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
			
	}
}

