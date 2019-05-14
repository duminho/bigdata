package java03;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class 다이얼로그4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("형의 나이를 입력하시오");
		int a=sc.nextInt();
		System.out.print("동생의 나이를 입력하시오");
		int b=sc.nextInt();
		
		if(a>=b) {
			System.out.println("형의 나이가 많아서 형이 떡을2개 먹어요");
		}else {
			System.out.println("동생의 나이가 많아서 동생이 떡을2개 먹어요");
		}
	}

}
