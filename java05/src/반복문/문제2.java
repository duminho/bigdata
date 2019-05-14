package 반복문;

import java.util.Scanner;

public class 문제2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("별의 갯수를 입력하세요.");
		int num=sc.nextInt();
		
		for (int i = 0; i < num; i++) {
			System.out.print("★");
		}
	}

}
