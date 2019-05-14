package Window;

import java.util.Date;

public class 날짜테스트 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		int hour = date.getHours();
		int min = date.getMinutes();
		int sec = date.getSeconds();
		System.out.print("현재시각은 "+ hour+"시 "+min+"분"+sec+"초 입니다.");
		
	}

}
