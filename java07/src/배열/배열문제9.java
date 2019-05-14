package 배열;

import java.util.Scanner;

public class 배열문제9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] seat = new int[10];
		
		while(true) {
			System.out.println("-------------------------------");
			for (int i = 0; i < 10; i++) {
				System.out.print(+i+1+"  ");
			}
			System.out.println();
			System.out.println("-------------------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(seat[i]+"  ");
			}
			System.out.println();
			System.out.println("===============================");
			System.out.print("종료는 x 예매는 o >>");
			String end = sc.next();
			
			if(end.equals("x")) {
				System.out.println("시스템을 종료합니다.");
				break;
			}
			
			System.out.print("예매할 좌석번호 입력>>");
			int input = sc.nextInt();
			
			if(seat[input-1] != 1) {
				seat[input-1]=1;				
				System.out.println("좌석 예매 완료.");
			}else {
				System.out.println("이미 예약된 좌석입니다.");
				System.out.println("다른 좌석을 선택해주세요.");
			}
		}
	}
}
