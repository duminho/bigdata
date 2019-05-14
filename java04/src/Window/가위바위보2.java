package Window;

import java.util.Random;
import java.util.Scanner;

public class 가위바위보2 {

	public static void main(String[] args) {
		
		/*Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		String d = null;
		String me = null;
		int i=0;
		
		System.out.print("가위 바위 보");
		int f=sc.nextInt();
		int r = ran.nextInt(3);
		
		switch(f) {
		case 0: me="가위"; break;
		case 1: me="바위"; break;
		case 2: me="보"; break;
		}
		switch(r) {
		case 0: d="가위"; break;
		case 1: d="바위"; break;
		case 2: d="보"; break;
		}
		String num1 = me; 
		String num2 = d; 
		if(me == d) {
			i=i+3;
		}else if(me == "가위" && d == "바위"){
			i=i+1;
		}else if(me == "바위" && d == "보"){
			i=i+1;
		}else if(me == "보" && d == "가위"){
			i=i+1;
		}else if(me == "바위" && d == "가위"){
			i=i+2;
		}else if(me == "보" && d == "바위"){
			i=i+2;
		}else if(me == "가위" && d == "보"){
			i=i+2;
		}
		if(i == 1) {
			System.out.println(num1+" vs "+num2+" 졌습니다.");
		}else if(i == 2) {
			System.out.println(num1+" vs "+num2+" 이겼습니다.");
		}else {
			System.out.println(num1+" vs "+num2+" 비겼습니다.");
		}*/
		Scanner sc = new Scanner(System.in);
		System.out.print("0)가위,1)바위,2)보 입력>>");
		int me =sc.nextInt();
		
		Random random = new Random();
		int computer = random.nextInt(3);
		String win = null;
		if(me == 0) {
			if(computer == 0) {
				win  = "비겼습니다.";
			}else if(computer==1) {
				win = "컴퓨터가 승리";
			}else {
				win = "내가 승리";
			}
		}else if(me==1) {
			if(computer == 1) {
				win  = "비겼습니다.";
			}else if(computer==2) {
				win = "컴퓨터가 승리";
			}else {
				win = "내가 승리";
			}
		}else if(me==2) {
			if(computer == 2) {
				win  = "비겼습니다.";
			}else if(computer==1) {
				win = "컴퓨터가 승리";
			}else {
				win = "내가 승리";
			}
		}
		System.out.println(win);
		
		
	}

}
