package 반복문;

public class ForTest1 {
	int test;//전역변수(global)
	
	public static void main(String[] args) {
		//for(초기값;조건값;증감값)
		int sum =0;//지역변수(local)
		int start =1;
		for(start = 1; start <= 10; start++) {
			sum= sum+start;
		}
		System.out.println("1부터 10까지의 합은:"+sum);
	}

}
