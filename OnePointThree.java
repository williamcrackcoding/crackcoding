import java.util.*;


public class OnePointThree {
	
	public static char[] fillSpaces(char[] str) {
			
		int newStrLength = 0;
		int originalStrLength = str.length;
		
		for(int i = 0; i < str.length ; i++) {
			if (str[i] == ' ') {
				newStrLength+=3;
			}else {
				newStrLength++;
			}
		}
		
		char[] newStr = new char[newStrLength];
		int index = 0;
		for (int j = 0; j < originalStrLength ; j++) {			
			if (str[j] == ' ') {
				newStr[index++] = '0';
				newStr[index++] = '2';
				newStr[index++] = '%';
			} else {
				newStr[index++] = str[j];
			}
		}		
		
		return newStr;
	}
	
	
	public static void main(String[] args) {
		String s = "One Two       Three";
		char[] newStr = fillSpaces(s.toCharArray());
		System.out.println(newStr);
	}
}
