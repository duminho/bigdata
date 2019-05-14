package Window;

import java.util.Date;

public class 인사 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		int hour = date.getHours();
		
		if(hour<12) {
			System.out.println("굿모닝");
		}else if(hour<17) {
			System.out.println("굿에프터눈");
		}else if(hour<20) {
			System.out.println("굿나잇");
		}
			
	}

}
