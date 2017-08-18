import java.util.*;

public class MergeSort {
	
	public static int[] helper;
	
	public static void merge(int[] array, int low, int mid, int high) {
		for(int i = low; i <= high; i++) {
			helper[i] = array[i];
		}
		
		int i = low;
		int j = mid+1;
		int k = low;
		
		while (i <= mid && j <= high) {
			if(helper[i] <= helper[j]) {
				array[k] = helper[i];
				i++;
			} else {
				array[k] = helper[j];
				j++;
			}
			k++;
		}
		
		while (i <= mid) {
			array[k] = helper[i];
			k++;
			i++;
		}
	}
	
	public static void mergeSort(int[] array, int low, int high) {
		if (low < high ) {
			int mid = (low + high)/2;
			mergeSort(array, low, mid);
			mergeSort(array, mid+1, high);
			merge(array, low, mid, high);
		}	
	}
	
	public static void main(String[] args) {
		int[] array = {2,4,6,1,1,10,2,4,3,2,9,7,5,6,3};
		helper= new int[array.length];
		mergeSort(array, 0, array.length-1);
		System.out.println(Arrays.toString(array));
	}
}
