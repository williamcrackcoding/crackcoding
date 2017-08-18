import java.util.Arrays;

public class RotateMatrix {
	
	public static void rotateMatrixLeft90deg(int[][] array) {
		int N = array.length;
		for (int x = 0 ; x < N/2 ; x++) {
			for (int y = x ; y < N-1-x ; y++) {
				int temp = array[x][y];
				array[x][y] = array[y][N-1-x];
				array[y][N-1-x] = array[N-1-x][N-1-y];
				array[N-1-x][N-1-y] = array[N-1-y][x];
				array[N-1-y][x] = temp;
			}
		}
	}
	
	public static void rotateMatrixRight90deg(int[][] array) {
		int N = array.length;
		for (int x = 0 ; x < N/2 ; x++) {
			for (int y = x ; y < N-1-x ; y++) {
				int temp = array[x][y];
				array[x][y] = array[N-1-y][x];
				array[N-1-y][x] = array[N-1-x][N-1-y];
				array[N-1-x][N-1-y] = array[y][N-1-x];
				array[y][N-1-x] = temp;
			}
		}
	}
	
	public static void rotateMatrix180deg(int[][] array) {
		int N = array.length;
		for (int x = 0 ; x < N/2 ; x++) {
			for (int y = 0 ; y < N ; y++) {
				int temp = array[x][y];
				array[x][y] = array[N-1-x][y];
				array[N-1-x][y] = temp;
				
			}
		}
	}
	
	
	public static void main(String[] args) {
		int[][] array1 = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
		rotateMatrixLeft90deg(array1);
		System.out.println(Arrays.deepToString(array1));
		int[][] array2 = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
		rotateMatrixRight90deg(array2);
		System.out.println(Arrays.deepToString(array2));
		int[][] array3 = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
		rotateMatrix180deg(array3);
		System.out.println(Arrays.deepToString(array3));
		
	}
}
