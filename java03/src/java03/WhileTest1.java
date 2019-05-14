package java03;

import java.util.Scanner;

public class WhileTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=0,b=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("두 수를 입력받으세요");
		a=sc.nextInt();
		b=sc.nextInt();
		if(a>b) {
			System.out.println("a가 b보다 더 큽니다.");
		}else if(a<b){
			System.out.println("b가 a보다 더 큽니다.");
		}else {
			System.out.println("둘은 같습니다.");
		}
		
	}

}
