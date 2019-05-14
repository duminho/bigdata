package 배열;

import java.util.Scanner;

public class 성적프로그램 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] name = new String[3];
		int[] score = new int[3];
		int[] score2 = new int[3];
		int[] imsi= {0,0};
		int jmax=0;
		int min=500;
		
		for (int i = 0; i < 3; i++) {
			System.out.print("학생이름: ");
			name[i]=sc.next();
			System.out.print("학생점수(자바): ");
			score[i]=sc.nextInt();
			if(jmax<score[i]) {
				jmax=score[i];
				imsi[0]=i;
			}
			System.out.print("학생점수(스프링): ");
			score2[i]=sc.nextInt();
			if(min>score2[i]) {
				min=score2[i];
				imsi[1]=i;
			}
			System.out.println();
		}
		System.out.println("세 학생의 이름은:"+name[0]+", "+name[1]+", "+name[2]);
		System.out.println("학생중 가장 높은 자바 점수:"+jmax+"("+name[imsi[0]]+")");
		System.out.println("학생중 가장 낮은 스프링 점수:"+min+"("+name[imsi[1]]+")");
		
		sc.close();
	}

}
