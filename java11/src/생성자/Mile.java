package 생성자;

public class Mile {

	String id;
	String pw;
	String rank;
	int mile;
	
	
	public Mile() {
	}

	public Mile(String id, String pw, String rank, int mile) {
		this.id = id;
		this.pw = pw;
		this.rank = rank;
		this.mile = mile;
	}

	public String toString() {
		return id + "\t" + pw + "\t" + rank + "\t" + mile;
	}
	
	
}
