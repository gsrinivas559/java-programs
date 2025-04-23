package javaPrograms;

public class AddTwoMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first[][] = {{1,2},{3,4},{5,6}};
		int second[][] = {{10,20},{30,40},{50,60}};
		
		int row = first.length;
		int col = first[0].length;
		
		int sum[][] = new int[row][col];
		
		System.out.println("Calculating sum of two matrices..");
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				sum[i][j] = first[i][j] + second[i][j];
			}
		}
		System.out.println("Sum of two matrices..");
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				System.out.print(sum[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
