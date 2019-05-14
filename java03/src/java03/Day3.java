package java03;

import java.util.Scanner;

public class Day3 {

	public static void main(String[] args) {
		
		/*오늘 아침에 대한 정보 출력(변수에 저장해서 출력)
		 * ---------------------
		 * 오늘 아침을 먹고 왔나요?true
		 * 오늘 타고 온 버스의 번호나 지하철 노선은?2호선
		 * 오늘은 어제(10.5)보다 5.5도 낮아요. 오늘의 온도는:9
		 * 오늘 부터 프로젝트 함계할 우리 조원의 이름은:홍길동
		 */
		
		Scanner sc=new Scanner(System.in);
		
		boolean a=true;
		int b=0;
		double c=0;
		String d="홍길동";
		
		System.out.print("오늘 아침을 먹고 왔나요?");
		a=sc.nextBoolean();
		System.out.print("오늘 타고 온 버스의 번호나 지하철의 노선은?");
		b=sc.nextInt();
		System.out.print("오늘은 어제(10.5)보다 5.5도 낮아요. 오늘의 온도는");
		c=sc.nextDouble();
		System.out.print("오늘부터 프로젝트 할께할 조원의 이름은:");
		d=sc.next();
	}

}
