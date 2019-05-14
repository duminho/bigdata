package 배열;

import java.util.Scanner;

public class 배열문제6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total=0;
		int[] num = new int[5];
		
		for (int i = 0; i < num.length; i++) {
			System.out.print("성적 입력>>");
			num[i]=sc.nextInt();
			total+=num[i];
		}
		System.out.println("5명의 평균 성적은 "+total/5+"입니다.");
		
	}
}
