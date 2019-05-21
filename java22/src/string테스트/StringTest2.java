package string테스트;

public class StringTest2 {

	public static void main(String[] args) {
		String s1 = "I am a java programmer";
		String s2 = "I am a python programmer";
		String s3 = "2011511";
		
		System.out.println(s1.equals(s2)); //참조하고 있는 값을 비교
		System.out.println(s1 == s2); // 객체에 들어있는 주소값을 비교
		
		System.out.println(s1.toString()); //값이 출력
		System.out.println(s1.equals(s2)); //참조하고 있는 값을 비교
		System.out.println(s1.length());	//글자의 길이
		System.out.println(s1.charAt(7));	//7번째 글자 추출
		System.out.println(s3.charAt(0));	//0번째 글자 추출
		
		StringBuffer buffer = new StringBuffer("hello");
		System.out.println(buffer.charAt(0));	//0번째 글자 추출
		System.out.println(s1.substring(1));	//입력한 글자 번호부터 끝까지 추출
		System.out.println(s1.substring(7,11));	//글자번호 7번부터 10까지 추출
		String[] result=s1.split(" ");	//문자열을 구분기호로 나누어 문자열 배열 (공백조차 안만들어 주면 아무것도 안나옴)
		System.out.println(result.toString()); //주소값 출력
		for (String s : result) {	//공백으로 나뉘어서
			System.out.println(s);
		}
		
		String s5="Hi, Good Morning";
		String[] result2 = s5.split(" ");
		System.out.println(result2.length);
		for (String s : result2) {
			System.out.println(s);
		}
		System.out.println("-----------------------------");
		String[] result3 = s5.split(",");
		System.out.println(result3.length);
		for (String s : result3) {
			System.out.println(s);
		}
		String s6="Hi, Good Morning!";
		String[] result4 = s5.split("[.]");
		System.out.println(result4.length);
		for (String s : result4) {
			System.out.println(s);
		}
		
		System.out.println(s6.indexOf("Good"));
		
		String s7 = "http://www.naver.com/member/index.jsp";
		System.out.println(s7.lastIndexOf("/"));
		System.out.println(s7.substring(s7.lastIndexOf("/")));
		
		System.out.println(s6.toUpperCase());
		System.out.println(s6.toLowerCase());
		
		String s66 = s6.replaceAll("Good", "best");
		System.out.println(s66);
		
		char[] result6 = s6.toCharArray();
		for (char c : result6) {
			System.out.println(c);
		}
		
		String s8 = "   hello!! win!!    ";
		System.out.println(s8.trim());//앞뒤 공백만 짤림
		
		System.out.println(s8.concat("final"));	//끝에 덧붙이기 기능
		System.out.println(s8.contains("hello")); // 비교자? 있는지 없는지 판별해준는 기능인듯
		String s9="winner class";
		System.out.println(s9.startsWith("winner"));//시작 문자인가요? yes/no
		System.out.println(s9.endsWith("class"));//끝나는 문자인가요? yes/no
		String s10 = "hera@naver.com";
		System.out.println(s10.endsWith("com"));
		if(s10.endsWith("com")) {
			System.out.println("닷컴회사시군요");
		}else {
			System.out.println("닷컴회사가 아니시군요");
		}
//		String me ="960813-11xxxxx";
//		System.out.println(me.charAt(7));
		
	}

}
