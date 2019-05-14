package 자바기초;

import java.util.Scanner;

public class 파티인원 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] name = new String[5];
		int[] age = new int[5];
		int total=0;
		
		System.out.println("이름과 나이를 입력하세요");
		for (int i = 0; i < age.length; i++) {
			System.out.print("입력>>");
			name[i]=sc.next();
			age[i]=sc.nextInt();
			total+=age[i];
		}
		System.out.println("전체 인원수는 5명");
		System.out.println("파티 참가 명단");
		System.out.println("-------------------");
		for (int i = 0; i < age.length; i++) {
			System.out.println("이름은 "+name[i]+", 나이는 "+age[i]);
		}
		System.out.println("파티 평균 나이는 "+total/5+"세 입니다.");
		
		sc.close();
	}

}
