package java16;

public class MemberDTO {

	private String number;
	private String id;
	private String pw;
	
	public MemberDTO(String number, String id, String pw) {
		this.number = number;
		this.id = id;
		this.pw = pw;
	}

	//알트+쉬프트+s+r : setters/getters

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	@Override
	public String toString() {
		return "MemberDTO [number=" + number + ", id=" + id + ", pw=" + pw + "]";
	}
	
}
