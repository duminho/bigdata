package java19;

public class TestChild extends TestParents{

	int a;
	int b;
//	public TestChild() {
//		
//	}
//	public TestChild(int a, int b) {
//		super();
//		this.a = a;
//		this.b = b;
//	}
	public TestChild(int c, int d, int a, int b) {
		super(c, d);
		this.a = a;
		this.b = b;
	}
	
	
}
