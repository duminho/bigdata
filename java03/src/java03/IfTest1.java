package java03;

import java.util.Scanner;

public class IfTest1 {

	public static void main(String[] args) {
		//if 뒤에는 반드시 조건을 쓴다!!
		//조건의 결과는? boolean(논리형, true/false)
		int food=0;//입력
		Scanner sc=new Scanner(System.in);//콘솔에서 입력class
		
		System.out.println("저기요!!");
		System.out.println("------------");
		System.out.println("메뉴를 고르세요");
		System.out.println("------------");
		System.out.println("1)짜장면, 2)짬뽕, 3)우동");
		System.out.print("당신의 선택은?");
		food=sc.nextInt();//메소드==함수, 명령어
		
		if(food == 1) {
			System.out.println("짜장면을 주문하셨습니다.");
		}else if(food==2){
			System.out.println("짬뽕을 주문하셨습니다.");
		}else if(food==3) {
			System.out.println("우동을 주문하셨습니다.");
		}else {
			System.out.println("메뉴를 다시 선택해주세요");
		}
		
	}//main end.

}//class end.
