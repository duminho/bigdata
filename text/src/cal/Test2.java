package cal;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=400;
		int result=a%2;
		
		if(a % 2 == 0) {
			System.out.println(a+"Àº Â¦¼ö");
		}
		else {
			System.out.println(a+"Àº È¦¼ö");
		}
		System.out.println("-----»ïÇ×¿¬»êÀÚ--------");
		
		System.out.println(result == 0 ? "Â¦¼ö":"È¦¼ö");

	}

}
