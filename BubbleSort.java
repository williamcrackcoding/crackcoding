import java.util.Arrays;

public class BubbleSort {
	
	public static void bubbleSort(int[] array) {
		boolean swapped = true;
		int j = 0;
		int tmp;
		while (swapped) {
			swapped = false;
			j++;
			for (int i = 0; i < array.length - j ; i++) {
				if(array[i] > array[i+1]) {
					tmp = array[i];
					array[i] = array[i+1];
					array[i+1] = tmp;
					swapped=true;
				}
			}
		}
	}
		
	public static void main(String[] args) {
		int[] array = {2,4,8,1,2,6,4,3,2,10,1};
		bubbleSort(array);
		System.out.println(Arrays.toString(array));
	}
}
