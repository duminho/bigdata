package java18;

public class Board {
	String title;
	String content;
	String name;
	String pw;
	
	public Board(String title, String content, String name, String pw) {
		this.title = title;
		this.content = content;
		this.name = name;
		this.pw = pw;
	}

	@Override
	public String toString() {
		return "Board [title=" + title + ", content=" + content + ", name=" + name + ", pw=" + pw + "]";
	}
	
	
}
