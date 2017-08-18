import java.util.*;

public class OnePointOne {

	public static boolean findUniqchar(String str) {
		
		if (str.length() > 128) {
			return false;
		}
		boolean[] bool = new boolean[128]; //According to ASCII
		for (int i = 0; i < str.length(); i++) {
			int char_val = str.charAt(i);
			if (bool[char_val] == true)
				return false;
			bool[char_val] = true;		
		}
		return true;
		
	}
	
	public static void main(String[] args) {
		String str = "acds";
		boolean result = findUniqchar(str);
		System.out.println(result);
	}
	
}
