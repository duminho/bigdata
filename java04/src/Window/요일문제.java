package Window;

import java.util.Date;

public class 요일문제 {

	public static void main(String[] args) {
		
		Date date = new Date();
		int day = date.getDay();
		
		switch(day) {
		case 1:System.out.println("학원에 가는 날"); break;
		case 2:System.out.println("동네 한바퀴도는 날"); break;
		case 3:System.out.println("수요일"); break;	
		case 4:System.out.println("목요일"); break;	
		case 5:System.out.println("금요일"); break;	
		case 6:System.out.println("토요일"); break;	
		case 7:System.out.println("일요일"); break;	
		}
	}

}
