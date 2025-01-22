package StringAsses.checkVowels;

public interface Methods {
	public static boolean isVowel(char c) {
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
				|| c == 'U')
			return true;
		else
			return false;
	}

	public static boolean isConsonent(char c) {
		if (!isVowel(c))
			return true;
		else
			return false;
	}

	public static int countVowels(String ar) {
		int count = 0;
		for (int i = 0; i < ar.strip().length(); i++) {
			if (isChar(ar.charAt(i)))
				if (isVowel(ar.charAt(i)))
					count++;
		}
		return count;
	}

	public static int countConsonents(String ar) {
		int count = 0;
		for (int i = 0; i < ar.strip().length(); i++) {
			if (isChar(ar.charAt(i)))
				if (isConsonent(ar.charAt(i)))
					count++;
		}
		return count;
	}

	public static int countSpace(String ar) {
		int count = 0;
		for (int i = 0; i < ar.length(); i++) {
			if (ar.charAt(i) == ' ')
				count++;
		}
		return count;
	}

	public static int countOccuredChar(String ar, char c) {
		int count = 0;
		for (int i = 0; i < ar.length(); i++) {
			if (ar.charAt(i) == c)
				count++;
		}
		return count;
	}

	public static boolean isContainUpperCaseChar(String string) {
		for (int i = 0; i < string.length(); i++) {
			int value = string.charAt(i);
			if (isUpperCaseChar(string.charAt(i)))
				return true;
		}
		return false;
	}

	public static boolean isContainLowerCaseChar(String string) {
		for (int i = 0; i < string.length(); i++) {
			if (isLowerCaseChar(string.charAt(i)))
				return true;
		}
		return false;
	}

	public static boolean isChar(char Char) {

		if ((Char >= 65 && Char <= 90) || (Char >= 97 && Char <= 122))
			return true;
		else
			return false;

	}

	public static boolean isLowerCaseChar(char Char) {

		if (Char >= 97 && Char <= 122)
			return true;
		else
			return false;

	}

	public static boolean isUpperCaseChar(char Char) {

		if (Char >= 65 && Char <= 90)
			return true;
		else
			return false;

	}

	public static boolean isContainSpecialChar(String string) {

		for (int i = 0; i < string.length(); i++) {
			int value = string.charAt(i);
			if (!(value >= 65 && value <= 90) && !(value >= 97 && value <= 122))
				return true;
		}
		return false;
	}

	public static boolean isSpecialChar(char character) {
		if (!(character >= 65 && character <= 90) && !(character >= 97 && character <= 122))
			return true;
		else
			return false;
	}

	public static boolean isContainSpace(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ')
				return true;
		}
		return false;
	}

	public static boolean isContainSpace(char c) {
		if (c == ' ')
			return true;
		else
			return false;
	}

	public static boolean isPalindrome(String string) {
		for (int i = 0; i < string.length() / 2; i++) {
			if (!(string.charAt(i) == string.charAt(string.length() - i - 1)))
				return false;
		}
		return true;
	}

	public static String reverseString(String string) {
		String reverseString = "";
		for (int i = string.length() - 1; i >= 0; i--) {
			reverseString += string.charAt(i);
		}
		return reverseString;
	}

	public static String removeSpace(String string) {
		String st = "";
		for (int i = 0; i <= string.length() - 1; i++) {
			if (string.charAt(i) != ' ')
				st += string.charAt(i);
		}
		return st;
	}

	public static void characterFrequency(String input) {
		int[] frequency = new int[256];

		for (char ch : input.toCharArray()) {
			if (ch != ' ') {
				frequency[ch]++;
			}
		}

		for (int i = 0; i < frequency.length; i++) {
			if (frequency[i] > 0) {
				System.out.println((char) i + " " + frequency[i]);
			}
		}
	}

	public static boolean isContainNumber(char c) {   
    	if(c=='1'||c=='2'||c=='3'||c=='4'||c=='5'||c=='6'||c=='7'||c=='8'||c=='9'||c=='0') return true;
    	else return false;
	}

	public static boolean isContainNumber(String string) {
		for (int i = 0; i < string.length(); i++) {
			if (isContainNumber(string.charAt(i)))
				return true;

		}
		return false;
	}

	public static boolean isPasswordValid(String password) {
		
    	if(password!=null&&password.length()>8&&password.length()<15) {
    		if(isContainLowerCaseChar(password)) {
    			if(isContainUpperCaseChar(password)) {
    		    	if(!(isContainSpace(password))) {
    				    if(isContainSpecialChar(password)) {
    						if(isContainNumber(password)) {
    							return true;
    						}else {
    				    		return false;
    				    	}
    					}else {
    			    		return false;
    			    	}
    				}else {
    		    		return false;
    		    	}
    			}else {
    	    		return false;
    	    	}
    		}else {
        		return false;
        	}
    		
    	}else {
    		return false;
    	}
	}
}