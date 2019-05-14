package 배열;

public class 배열연습2 {

	public static void main(String[] args) {
		int[] num = {444,666,777};
		int a=0;
		//배열의 첫번째 값에 세번째 값을 넣어보세요.
		//첫번째 값을 확인, 세번째 값을 확인.
		System.out.println(num[0]);
		a = num[0];
		num[0] = num[2];
		System.out.println(num[0]);
		num[2] = a;
		System.out.println(num[2]);
		
		
	}

}
