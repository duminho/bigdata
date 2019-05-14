package 자바기초;

import java.util.Scanner;

public class 동아리 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] name = {"김아무개","박아무개","송아무개","정아무개","장아무개"};
		int[] lv = {1,1,2,3,1};
		String[] rat = {"A","B","C","A","B"};
		String[] list = {"A","B","C","D","F"};
		int index=0;
		int[] num = {0,0,0,0};
		int[] num2 = {0,0,0,0,0};
		String name2=null;
		
		System.out.println("동아리 명단의 이번 학기 성적");
		System.out.println("이름\t 나이\t 학점");
		System.out.println("----------------------");
		for (int i = 0; i < 5; i++) {
			System.out.println(name[i]+"\t "+lv[i]+"\t "+rat[i]);
		}
		for (int i = 0; i < 5; i++) {
			switch(lv[i]) {
			case 1: num[0]++;break;
			case 2: num[1]++;break;
			case 3: num[2]++;break;
			case 4: num[3]++;break;
			}
		}
		for (int i = 0; i < 5; i++) {
			switch(rat[i]) {
			case "A": num2[0]++;break;
			case "B": num2[1]++;break;
			case "C": num2[2]++;break;
			case "D": num2[3]++;break;
			case "F": num2[4]++;break;
			}
		}
		System.out.println();
		for (int i = 0; i < num.length; i++) {
			System.out.println(i+1+"학년: "+num[i]+"명");
		}
		System.out.println();
		for (int i = 0; i < 5; i++) {
			System.out.println(list[i]+"학점: "+num2[i]+"명");
		}
		System.out.print("위치를 찾고싶은 이름: ");
		name2=sc.next();
		
		for (int i = 0; i < 5; i++) {
			if(name2.equals(name[i])) {
				index=i+1;
			}
		}
		System.out.println(index+"번째 입니다.");
		System.out.println();
		
		System.out.print("정보를 알고싶은 이름: ");
		name2=sc.next();
		
		for (int i = 0; i < 5; i++) {
			if(name2.equals(name[i])) {
				index=i+1;
			}
		}
		System.out.println(index+"번째 입니다.");
		System.out.println(lv[index-1]+"학년이고, "+rat[index-1]+"학점 입니다.");
		
		sc.close();
	}

}
