import java.util.Arrays;

public class ZeroMatrix {
	public static int[][] arrayReplacement;
	
	public static void replaceWithZero(int[][] array, int row, int col) {
		for (int i = 0; i < array.length ; i++) {
			arrayReplacement[row][i] = 0;
			System.out.println("i");
		}
		for (int j = 0; j < array.length ; j++) {
			arrayReplacement[j][col] = 0;
			System.out.println("j");
		}
	}
	
	public static void setZeros(int[][] array) {
		for (int i = 0 ; i < array.length; i++) {
			for (int j = 0 ; j < array[0].length ; j++) {
				if (array[i][j] == 0) {
					replaceWithZero(array, i, j);
					//arrayReplacement[i][j] = array[i][j];
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[][] array1 = {{1,0,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
		//arrayReplacement = new int[array1.length][array1[0].length];
		arrayReplacement = new int[][]{{1,1,1,1}, {1,1,1,1}, {1,1,1,1}, {1,1,1,1}};
		setZeros(array1);
		System.out.println(Arrays.deepToString(arrayReplacement));
	}
}
