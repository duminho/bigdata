package 배열;

import java.util.Scanner;

public class 배열문제5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] num = {0,0,0,0};
		int max=0;
		
		for (int i = 0; i < num.length; i++) {
			System.out.print("숫자 입력>>");
			num[i]=sc.nextInt();
			if(max<num[i]) {
				max=num[i];
			}
		}
		int min=max;
		
		for (int i = 0; i < num.length; i++) {
			if(min>num[i]) {
				min=num[i];
			}
		}
		
		System.out.println("배열의 최대값은 "+max+"입니다.");
		System.out.println("배열의 최소값은 "+min+"입니다.");
		
		for (int i : num) {
			System.out.print(i+" ");
		}
		sc.close();
	}
}
