package 반복문;

import java.util.Scanner;

import javax.swing.SwingWorker;

public class 문제6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1)봄, 2)여름, 3)가을, 4)겨울");
		
		for (int i = 0; i < 1;) {
			
			System.out.print("계절을 입력하세요=>");
			int num=sc.nextInt();
			switch(num) {
			case 1:System.out.println("계절은 봄입니다."); i++; break;
			case 2:System.out.println("계절은 여름입니다."); i++; break;
			case 3:System.out.println("계절은 가을입니다."); i++; break;
			case 4:System.out.println("계절은 겨울입니다."); i++; break;
			}
		}
		sc.close();
	}

}
