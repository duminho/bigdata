package Window;

import java.util.Date;

public class 요일문제2 {

	public static void main(String[] args) {
		
		Date date = new Date();
		int year = date.getYear()+1900;
		year=2222-year;
		
		System.out.println("앞으로 2222년이 되려면 몇년이 남았나?"+ year+"년 남았습니다.");
	}
}

