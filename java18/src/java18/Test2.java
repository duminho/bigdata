package java18;

import java.util.HashMap;

public class Test2 {

	public static void main(String[] args) {
		HashMap hash = new HashMap();
		Board b1 = new Board("책","지식","도서관","1236");
		Board b2 = new Board("버스","교통체증","대한운통","1235");
		Board b3 = new Board("나무","장수나무","환경사랑","1234");
		hash.put(100, b1);
		hash.put(200, b2);
		hash.put(300, b3);
		System.out.println(hash);
		System.out.println(hash.get(100));
	}

}
