package 반복문;

public class ForTest2 {
	int test;//전역변수(global)
	
	public static void main(String[] args) {
		//for(초기값;조건값;증감값)
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				
				System.out.print("★");
			}
			
			System.out.println();
		}
	}

}
