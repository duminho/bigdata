package 배열;

import java.util.Iterator;

import javax.swing.JButton;

public class 스트링배열 {

	public static void main(String[] args) {
		int ages[] = {50,100,10};
		String[] names = {"홍길동","박길동","김길동"};
		names[2] ="김동길";
		names[names.length-1]="김동순";
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i]+":");
			System.out.println(ages[i]);
		}
		//String[] names = {"char(홍/길/동)","박/길/동","김/길/동"};
		
		for (String imsi : names) {//foreach 알아서 돌아가는 반복문
			System.out.print(imsi+" ");//배열의 주소를 임시저장하고 출력을 반복
		}
		for (int i : ages) {
			System.out.print(i+" ");
		}
		
	}

}
