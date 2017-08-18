
public class OnePointTwo {
	
	public static boolean permutation(String str, String str2) {
		if (str.length() != str2.length())
			return false;
		int[] letters = new int[128];
		for (int i = 0 ; i < str.length() ; i++) {
			letters[str.charAt(i)]++;
		}
		for (int j = 0 ; j < str2.length() ; j++) {
			letters[str.charAt(j)]--;
			if (letters[str.charAt(j)] < 0)
				return false;				
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		String[][] pairs = {{"apple", "ppale"}, {"soup", "tut"}};
		for (String[] pair : pairs) {
			String s = pair[0];
			String w = pair[1];
			boolean result = permutation(s,w);
			System.out.println(result);
		}
	}
}
	