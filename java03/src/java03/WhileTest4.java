package java03;

import java.util.Scanner;

public class WhileTest4 {

	public static void main(String[] args) {

		int num=0;
		 
		Scanner sc=new Scanner(System.in);
		System.out.print("점수를 입력하세요:");
		num=sc.nextInt();
		
		char result;
		
		if(num >= 90) {
			result='A';
		}else if(num >= 80) {
			result='B';
		}else if(num >= 70) {
			result='C';
		}else if(num >= 60){
			result='D';
		}else {
			result='F';
		}
		System.out.println("당신의 학점은 "+result+"입니다.");
	}

}
