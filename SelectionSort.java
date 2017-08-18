import java.util.Arrays;

public class SelectionSort {
	
	
	public static void selectionSort(int[] array) {
		
		int tmp;
		
		for (int i = 0 ; i < array.length-1 ; i++) {
			for (int j = i+1 ; j < array.length ; j++ ) {
				if (array[j] < array[i]) {
					tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] array = {2,4,8,1,2,6,4,3,2,10,1};
		selectionSort(array);
		System.out.println(Arrays.toString(array));
	}
}
