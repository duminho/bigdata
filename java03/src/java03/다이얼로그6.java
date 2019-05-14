package java03;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class 다이얼로그6 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("자동차 성능 테스트를 해보세요");
		System.out.println("각 점수는 만점:100점");
		System.out.println("평점 : 속도50%, 안정성:30%, 연비20%");
		System.out.print("속도를 입력하세요");
		int a=sc.nextInt();
		System.out.print("안정성을 입력하세요");
		int b=sc.nextInt();
		System.out.print("연비를 입력하세요");
		int c=sc.nextInt();
		
		double total=(a*0.5)+(b*0.3)+(c*0.2);
		if(total>=80) {
			System.out.println("이 차는 우수합니다.");
		}else if(total>=70) {
			System.out.println("이 차는 보통입니다.");
		}else {
			System.out.println("이 차는 불량입니다.");
		}
		if(a>=80 && b>=80 && c>=80) {
			System.out.println("베스트");
		}
	}
}

