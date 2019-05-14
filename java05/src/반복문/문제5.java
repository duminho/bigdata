package 반복문;

import java.util.Scanner;

public class 문제5 {

	public static void main(String[] args) {
		
		int num=0;
		System.out.println("구구단을 출력하세요.");
		for (int i = 1; i <= 9; i++) {
			System.out.println(i+"단의 시작");
			for (int j = 1; j <= 9; j++) {
				num=i*j;
				System.out.println(i+"x"+j+"="+num);				
			}
		}
	}

}
