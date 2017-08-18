import java.util.*;

public class OnePointFive {
	
	public static boolean checkEdit(String s, String w) {
		
		if (s.length()-w.length() >= 2 || w.length()-s.length() >= 2) 
			return false;
		
		// check for each three cases
		char[] schar = s.toCharArray();
		char[] wchar = w.toCharArray();
		Arrays.sort(schar);
		Arrays.sort(wchar);		
		
		return true;
	}
	
	public static void main(String[] args) {
		String s = "pse";
		String w = "pale";
		if (checkEdit(s, w) == true) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
