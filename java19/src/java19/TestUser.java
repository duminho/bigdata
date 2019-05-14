package java19;

import java.util.Calendar;


public class TestUser {

	public static void main(String[] args) {
		Calendar cal=Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		int mon = cal.get(Calendar.MONDAY)+1;
		int day = cal.get(Calendar.DATE);
		int hour = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);
		int se = cal.get(Calendar.SECOND);
		
		System.out.println(year+"년 "+mon+"월 "+day+"일 ");
		System.out.println(hour+"시 "+min+"분 "+se+"초 ");
		
		int dayw = cal.get(Calendar.DAY_OF_WEEK);
		switch(dayw){
			case 1:System.out.println("일요일");break;
			case 2:System.out.println("월요일");break;
			case 3:System.out.println("화요일");break;
			case 4:System.out.println("수요일");break;
			case 5:System.out.println("목요일");break;
			case 6:System.out.println("금요일");break;
			case 7:System.out.println("토요일");break;
		}
		
		
	}

}
