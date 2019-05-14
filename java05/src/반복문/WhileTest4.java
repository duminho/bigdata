package 반복문;

import java.util.Scanner;

public class WhileTest4 {

	public static void main(String[] args) {
		//두개의 입력값을 받아서,
		//첫번째 값부터 두번째 값까지 더함.

		int num1=1;
		int sum=1;
		for(num1=1;num1<10;num1++) {
			sum=sum*num1;	
		}
		System.out.println("1부터 10까지 곱한값:"+sum);
	}//main end.

}//class 끝
