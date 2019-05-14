package text;

import java.util.Scanner;

public class me2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신의 취미는?");
		String a = sc.next();
		System.out.print("평소 TV시청 시간은 얼마인가요?");
		int b = sc.nextInt();
		System.out.print("봄여행을 다녀왔나요?");
		boolean c= sc.nextBoolean();
		
		System.out.println("----------------");
		System.out.println("내 취미는 "+a+"이고, 평소에 TV를"+b+"시간도 보지 않아요.");
		System.out.println("봄 여행은"+c+"예요");
	}

}
