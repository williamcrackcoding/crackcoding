import java.util.*;

public class QuickSort {	
	
	public static int partition(int[] array, int low, int high) {
		
		int pivot = array[(low+high)/2];
		int tmp;
		
		while (low <= high) {
			
			while (array[low] < pivot) {
				low++;
			}
			
			while (array[high] > pivot) {
				high--;
			}
			
			if (low <= high) {
				tmp = array[low];
				array[low] = array[high];
				array[high]	= tmp;
				low++;
				high--;
			}
		}	
		return low;
	}
	
	public static void quickSort(int[] array, int low, int high) {
		int index = partition(array, low, high);
		if (low < index -1) {
			quickSort(array, low, index-1);
		} 
		if (index < high) {
			quickSort(array, index, high);
		}
		
	}
	
	public static void main(String[] args) {
		int[] array = {2,4,8,1,2,6,4,3,2,10,1};
		quickSort(array, 0, array.length - 1);
		System.out.println(Arrays.toString(array));
	}

}
