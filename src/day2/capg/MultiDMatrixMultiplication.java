package day2.capg;

//3)	Matrix multiplication using multi-dimensional array. 
public class MultiDMatrixMultiplication {

	public static void main(String[] args) {
		int[][] a = { { 5, 3 }, { 6, 3 }, { 2, 1 } };
		int[][] b = { { 2, 3, 4 }, { 5, 2, 3 } };
		int row = 3;
		int col = 3;
		int[][] product = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				product[i][j] = 0;
				for (int k = 0; k < 2; k++) {
					product[i][j] += a[i][k] * b[k][j];
				}
				System.out.print(product[i][j] + " ");
			}
			System.out.println();

		}
	}
}
