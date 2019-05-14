package 생성자;

import java.util.Scanner;

public class 예금현황 {

	public static void main(String[] args) {
		
		String[] product = new String[3];
		String[] name = new String[3];
		int[] money = new int[3];
		Scanner sc = new Scanner(System.in);
		System.out.println("예금 시작");
		
		for (int i = 0; i < 3; i++) {
			
			System.out.print("가입할 상품명:");
			product[i]=sc.next();
			System.out.print("가입할 이름:");
			name[i]=sc.next();
			System.out.print("가입할 금액:");
			money[i]=sc.nextInt();
			
		}
		Saving[] sv = new Saving[3];
		System.out.println("상품명\t이름\t금액");
		for (int j = 0; j < 3; j++) {
			sv[j] = new Saving(product[j],name[j],money[j]);
			System.out.println(sv[j]);
		}
		int total=sv[0].add(money[0],money[1],money[2]);
		
		System.out.println(name[1]+" 통장에는 "+money[1]+"만원이 들어 있어요");
		System.out.println(name[0]+" 통장에는 "+money[0]+"만원이 들어 있어요");
		
		System.out.println("우리 집 전체 예금액은 "+total+"만원 이예요");
	}

}
