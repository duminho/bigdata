package 자바기초;

import java.util.Scanner;

public class 수강신청 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		int n=0;
		
		System.out.println("수강 신청을 진행합니다.");
		System.out.println("원하시는 과목을 선택해 주세요.");
		while(true) {
			System.out.println("-----------------------------------------");
			System.out.println("1)자바,2)스프링,3)안드로이드,4)파이썬,5)제이쿼리");
			System.out.println("-----------------------------------------");
			System.out.println(num[0]+"       "+num[1]+"       "+num[2]+"       "+num[3]+"       "+num[4]+"       ");
			System.out.println("==========================================");
			System.out.print("원하시는 과목코드를 입력해주세요.(종료=0)");
			n=sc.nextInt();
			
			if(n==0) {
				System.out.println("수강 신청을 종료합니다.");
				break;
			}if(num[n-1]!=1){
				num[n-1]=1;
				System.out.println("수강 신청 완료");
			}else {
				System.out.println("이미 수강하셨습니다.");
				System.out.println("다시 선택해 주세요.");
			}
			
		}
		
		sc.close();
	}

}
