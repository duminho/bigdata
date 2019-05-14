package 배열;

import java.util.Scanner;

public class 배열문제4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] num = {11,22,33,44};
		int index=0;
		
		for (int i = 0; i < num.length; i++) {
			if(num[i]==33) {
				index=i+1;
			}
		}
		for (int i : num) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("33의 위치는 "+index+"번 입니다.");
		
		
		
	}
}
