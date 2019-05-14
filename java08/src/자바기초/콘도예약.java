package 자바기초;

import java.util.Scanner;

public class 콘도예약 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		int n=0;
		
		System.out.println("----콘도 예약을 진행합니다.-----");
		System.out.println("원하시는 지역을 선택해 주세요.");
		while(true) {
			System.out.println("-----------------------------------------");
			System.out.println("1)강원도,2)전라도,3)파주,4)제주도,5)충청도");
			System.out.println("-----------------------------------------");
			System.out.println(num[0]+"       "+num[1]+"       "+num[2]+"       "+num[3]+"       "+num[4]+"       ");
			System.out.println("==========================================");
			System.out.print("원하시는 지역코드를 입력해주세요.(종료=0)");
			n=sc.nextInt();
			
			if(n==0) {
				System.out.println("예약 신청을 종료합니다.");
				break;
			}if(num[n-1]!=2){
				num[n-1]++;
				System.out.println("예약 신청 완료");
			}else {
				System.out.println("이미 인원이 초과하셨습니다.");
				System.out.println("다시 선택해 주세요.");
			}
			
		}
		
		sc.close();
	}

}
