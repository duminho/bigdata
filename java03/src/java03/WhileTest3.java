package java03;

import java.util.Random;
import java.util.Scanner;

public class WhileTest3 {

	public static void main(String[] args) {

		int count=0;
		int num=0;
		Scanner sc=new Scanner(System.in);
		Random random = new Random();
		int target = random.nextInt(100);
		while(true) {
			count++;
			System.out.print("당신이 생각한 숫자를 입력해보세요>>");
			num=sc.nextInt();
			if(target == num) {
				System.out.println("정답입니다.");
				break;
			}else if(target>num){
				System.out.println("정답보다 낮습니다.");
			}else if(target<num) {
				System.out.println("정답보다 높습니다.");
			}
		}//while end.
		System.out.println("도전 횟수"+count);
	}

}
