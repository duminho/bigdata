package 배열;

import java.util.Scanner;

public class 인기투표 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] name = {"0","0","0"};
		int[] num = new int[6];
		int[] num2 =new int[3];
		
		for (int i = 0; i < name.length; i++) {
			System.out.print("가수를 입력하세요>>");
			name[i] = sc.next();
		}
		System.out.println(name[0]+" "+name[1]+" "+name[2]);
		
		System.out.println("인기투표 시작");
		
		for (int i = 0; i < num.length; i++) {
			System.out.print("1)"+name[0]+" 2)"+name[1]+" 3)"+name[2]);			
			num[i]=sc.nextInt();
			
			if(num[i]>3 || num[i]<1) {
				i--;
				System.out.println("다시 투표하십시오");			
			}
		}
		for (int i = 0; i < num.length; i++) {
			if(num[i] == 1) {
				num2[0]++;
			}
			if(num[i] == 2) {
				num2[1]++;
			}
			if(num[i] == 3) {
				num2[2]++;
			}
		}
		System.out.println(name[0]+": "+num2[0]);
		System.out.println(name[1]+": "+num2[1]);
		System.out.println(name[2]+": "+num2[2]);
		sc.close();
	}

}
