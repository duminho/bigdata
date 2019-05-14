package java19;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;


public class SimpleDateFormatTest {

	public static void main(String[] args) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yy-m-d");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-mm-dd");
		String str = "2019-05-14";
		Date date =sdf.parse(str);
		System.out.println(sdf.format(date));
		System.out.println(sdf2.format(date));
	}
	

}
