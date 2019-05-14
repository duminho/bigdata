package 배열;

import java.util.Scanner;

public class 배열문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[3];
		int total;
		for (int  i= 0;  i< num.length; i++) {
			System.out.print("숫자 입력>>");
			num[i]=sc.nextInt();
		}
		total=num[0]+num[2];
		System.out.println(num[0]+"+"+num[2]+"="+total+"입니다.");
		
	}

}
