import java.util.*;

public class BinarySearch {
	
	public static int BinarySearch(int[] a, int x) {
		int high = a.length - 1;
		int low  = 0;
		int mid;
		
		while (low <= high) {
			mid = (low+high)/2;
			if (a[mid] < x) {
				low = a[mid + 1];
			} else if (a[mid] > x){
				high = a[mid - 1]; 
			} else {
				return mid;
			}
		}
		return -1;
	}
	
	public static int BinarySearchRec(int[] a, int x, int low, int high) {
		
		if (low > high) return -1;
		
		int mid = (low + high) / 2;
		if (a[mid] < x) {
			return BinarySearchRec(a, x, a[mid+1], high);
		} else if (a[mid] > x){
			return BinarySearchRec(a, x, low, a[mid-1]);
		} else {
			return mid;
		}
	}
		
	public static void main(String[] args) {
		
	}
}
