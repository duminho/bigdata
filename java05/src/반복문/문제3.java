package 반복문;

import java.util.Scanner;

public class 문제3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자1:");
		int n1=sc.nextInt();
		System.out.print("숫자2:");
		int n2=sc.nextInt();
		System.out.print("숫자3:");
		int n3=sc.nextInt();
		
		System.out.println("세수의 합:"+(n1+n2+n3));
	}

}
