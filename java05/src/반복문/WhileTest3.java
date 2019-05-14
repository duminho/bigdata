package 반복문;

import java.util.Scanner;

public class WhileTest3 {

	public static void main(String[] args) {
		//두개의 입력값을 받아서,
		//첫번째 값부터 두번째 값까지 더함.
		Scanner sc = new Scanner(System.in);
		System.out.println("두수를 입력하세요");
		System.out.print("숫자1 입력: ");
		int num1=sc.nextInt();//초기값(시작값)		
		System.out.print("숫자1 입력: ");
		int num2=sc.nextInt();		
		
		int sum=0;
		while(num1 <= num2) {//조건식
			sum = sum + num1;//더하는식
			num1++;//증감식;
		}
		System.out.println(num1+"와 "+num2+"의 합은:"+sum);
	}//main end.

}//class 끝
