package java18;

import java.util.HashSet;

public class SetTest {

	//HashSet: 순서 x 중복 x
	public static void main(String[] args) {
		HashSet bag = new HashSet();
		bag.add("휴지");
		bag.add("휴대폰");
		bag.add("지갑");
		System.out.println("내 가방속의 물건 개수: "+bag.size());
		System.out.println(bag);
		bag.add("지갑");
		System.out.println(bag);
		
	}
}
