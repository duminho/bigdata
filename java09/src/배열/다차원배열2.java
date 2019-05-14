package 배열;

public class 다차원배열2 {

	public static void main(String[] args) {
		
		int[][] clas = {
					{44,55,66},
					{77,88,99,100}
					};
		int total=0;
		
		for (int i = 0; i < clas.length; i++) {
			for (int j = 0; j < clas[i].length; j++) {
				total+=clas[i][j];
			}
			System.out.println(i+1+"반의 평균은 :"+total/clas[i].length);
			total=0;
		}
		for (int i = 0; i < clas.length; i++) {
			for (int j = 0; j < clas[i].length; j++) {
				System.out.print(clas[i][j]+" ");
			}
			System.out.println();
		}
	}

}
