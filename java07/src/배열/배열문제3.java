package 배열;

import java.util.Scanner;

public class 배열문제3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] num = {0,0,0,0,0};
		
		for (int i = 0; i < num.length; i++) {
			System.out.print("숫자입력>>");
			num[i]=sc.nextInt();
		}
		for (int i : num) {
			System.out.print(i+" ");
		}
		sc.close();
	}
}
