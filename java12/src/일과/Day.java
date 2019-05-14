package 일과;

public class Day {
	
	String work;
	int time;
	String location;
	static int count;
	static int ttime;
	
	public static int getTotal() {
		//return time;
		//static 메소드내에 사용되는 멤버변수는 반드시 static변수만
		//객체 생성과 상관없이 클래스 이름으로 접근가능한 변수
		return ttime;
	}
	
	public Day() {
	}

	public Day(String work, int time, String location) {
		this.work = work;
		this.time = time;
		this.location = location;
		count++;
		ttime+=time;
	}

	@Override
	public String toString() {
		return "Day [work=" + work + ", time=" + time + ", location=" + location + "]";
	}
	
	

}
