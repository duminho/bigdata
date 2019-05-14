package 부품만들기;

public class 커피숍 {

	public static void main(String[] args) {
		계산기 cal = new 계산기();
		
		int num;
		num=cal.add(5000, 4000);
		
		System.out.println(num-1000+"원만 내세요.");
		
	}

}
