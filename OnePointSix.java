import java.util.*;

public class OnePointSix {
	
	public static String shrink(String s) {
		char prevChar = s.charAt(0);
		StringBuilder str = new StringBuilder();
		int count = 1;
		for(int i = 1 ; i < s.length(); i++) {			
			if(prevChar == s.charAt(i)) {
				count++;
			} else {				
				str.append(prevChar);
				str.append(count);
				count = 1;				
			}	
			prevChar = s.charAt(i);
			System.out.println(prevChar);
		}
		str.append(prevChar);
		str.append(count);
		if (str.toString().length() >= s.length()) {
			return s;
		} else {
			return str.toString();
		}
	}
	
	public static void main(String[] args) {
		String s = "abc";
		System.out.println(shrink(s));
	}
}
