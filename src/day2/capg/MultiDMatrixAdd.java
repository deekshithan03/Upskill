package day2.capg;

//[2]WAP to perform Matrix addition using multi-dimensional array. 

public class MultiDMatrixAdd {

	public static void main(String[] args) {
		int[][] a = { {2, 3, 4}, {5, 2, 3} };//{ { 2, 4, 6 }, { 1, 3, 5 } };
		int[][] b = { {-4, 5, 3}, {5, 6, 3} };//{ { 1, 3, 5 }, { 2, 4, 6 } };
		int row=2;
		int col =3;
		int[][] sum = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j <col; j++) {
				sum[i][j] = a[i][j] + b[i][j];
				System.out.print(sum[i][j] + " ");
			}
			System.out.println();
		}
//	    for(int[] rows : sum) {
//        for (int columns : row) {
//            System.out.print(columns + "    ");
//        }
//        System.out.println();
//    }
	}

}