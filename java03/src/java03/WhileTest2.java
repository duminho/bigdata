package java03;

import java.util.Scanner;

public class WhileTest2 {

	public static void main(String[] args) {

		int a=0,b=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("두 수를 입력받으세요");
		a=sc.nextInt();
		b=sc.nextInt();
		
		int c=a+b;
		int d=a-b;
		int e=a*b;
		double f=a/b;
		
		System.out.println("두수의 +값"+c+" 두수의 -값"+d);
		System.out.println("두수의 *값"+e+" 두수의 /값"+f);
		
	}

}
