package Window;

import java.util.Date;
import java.util.Scanner;

public class 요일문제3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("등급을 입력해주세요");
		String date = sc.next();
		char gender = date.charAt(0);
		
		if(gender =='A') {
			System.out.println("최우수입니다.");
		}else if(gender =='B') {
			System.out.println("우수입니다.");
		}else if(gender =='C') {
			System.out.println("보통입니다.");
		}else{
			System.out.println("통과하지 못했습니다.");
		}
			
	}
}

