package 배열;

import java.util.Scanner;

public class 배열연습5 {

	public static void main(String[] args) {
		
		double[] f= {1.0,1.1,1.2,1.3,1.4};
		System.out.println("친구 5명의 시력:");
		for (int i = 0;  i< f.length; i++) {
			System.out.print(f[i]+" ");
		}
		System.out.println();
		char[] s= {'남','남','남','여','여'};
		System.out.println("친구 5명의 성별:");
		for (int j = 0; j < s.length; j++) {
			System.out.print(s[j]+" ");
		}
		System.out.println();
		char[] Am= {'A','A','C','D','B'};
		System.out.println("친구 5명의 학점:");
		for (int j = 0; j < Am.length; j++) {
			System.out.print(Am[j]+" ");
		}
		System.out.println();
		String[] name= {"홍길동","각시탈","자두","바둑이","정석"};
		System.out.println("친구 5명의 학점:");
		for (int j = 0; j < name.length; j++) {
			System.out.print(name[j]+" ");
		}
		System.out.println();
		int[] score= {15,80,25,40,90};
		System.out.println("친구 5명의 컴퓨터 점수:");
		for (int j = 0; j < score.length; j++) {
			System.out.print(score[j]+" ");
		}
		
		
	}

}
