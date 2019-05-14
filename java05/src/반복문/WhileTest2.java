package 반복문;

public class WhileTest2 {

	public static void main(String[] args) {
		
		int start=1;//초기값
		int sum = 0;
		while(start<=10) {//조건값
			//1부터 10까지 더해줌.
			sum = sum + start;
			System.out.println("start의 숫자변화"+start);
			start++;//증감값 (초,조,증)
		}
	}//main end.

}//class 끝
