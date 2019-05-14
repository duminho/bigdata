package 배열;

public class 배열연습4 {

	public static void main(String[] args) {
		int[] num = {44,66,22 ,88};
		
		System.out.println("리스트에 있는 값의 갯수"+num.length);
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println();
		num[0]=55;
		for (int j = 0; j < num.length; j++) {
			System.out.print(num[j]+" ");
		}
	}

}
