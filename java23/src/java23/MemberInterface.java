package java23;

public interface MemberInterface {
		//강제성있는 기능을 추상 메소드로 정의
		//일반 변수사용 불가, 일반 메소드 사용 불가
	//상수 사용 가능.
	//추상<->구체적
	//추상:불완전하다.
	//인터페이스는 객체를 생성하여 쓸 수 없다.
	//abstract:아직미정
	public abstract void insert(MemberDTO dto);
	void delete(String id);
	void update(MemberDTO dto);
	MemberDTO select(String id);
	
}
