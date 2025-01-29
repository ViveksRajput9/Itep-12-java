package StringAsses.checkVowels;

import java.util.Iterator;

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
	public static boolean isDigit(char c) {
		if(c>=48&&c<=57) return true;
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
	public static void mostOccuredChar(String str) {
		int arr[] = new int[256];
		int occurCharValue = 0;
		char occurChar = 0;

		for(int i=0;i<str.length();i++) {
			int c = str.charAt(i);
			if(c==' ') continue;
			arr[c]++;
			if(occurCharValue < arr[c]) {
			   occurCharValue = arr[c];
			   occurChar =  (char)c;	 
			}
		}
		System.out.println("Most frequent character : "+occurChar + " ( "+ occurCharValue +" times )");
	}
	public static char firstNonRepeatedChar(String str) {
		int arr[] = new int[256];
		for(int i=0;i<str.length();i++) {
			int c = str.charAt(i);
			if(c==' ') continue;
		 	arr[c]++;
		}
		for(int i=0;i<str.length();i++) {
			if(arr[str.charAt(i)]==1) return str.charAt(i);
		}
		return '0';
	}
	public static String removeDuplicateString(String string) {
		int arr[] = new int[256];
		StringBuilder stringBuilder = new StringBuilder();
		for(int i=0;i<string.length();i++) {
			char c = string.charAt(i);
			if(c==' ') continue;
		 	arr[c]++;
		 	if(arr[c] == 1) stringBuilder.append(c);
		}
		
		return stringBuilder.toString();
	}
	public static String removeAllDigits(String string) {
		String string1 = "";
		for (int i = 0; i < string.length(); i++) {
			if(!isDigit(string.charAt(i))) string1 += string.charAt(i);
		}
		return string1;
	}
	public static String shortestWord(String string) {
		if(string.isEmpty()) return null;
		String arr[] = string.split(" ");
		if(arr.length < 1) return arr[0];
		String string2= arr[0];
		int sortLengthStringValue = arr[0].length();
		
		for (int i = 1; i < arr.length; i++) {
			int length= arr[i].length();
			if(length < sortLengthStringValue) {
				sortLengthStringValue = length;
				string2 = arr[i];
			}
		}
		return string2;
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
    		if(!isContainLowerCaseChar(password)) return false;
    			if(!isContainUpperCaseChar(password)) return false;
    		    	if(isContainSpace(password)) return false;
    				    if(!isContainSpecialChar(password)) return false;
    						if(!isContainNumber(password)) return false;
    						 return true;

    	}else {
    		return false;
    	}
	}
	
	public static boolean isAnagram(String string1,String string2) {
		if(string1.length()!=string2.length()) return false;
	    StringBuffer stringBuffer=new StringBuffer(string2);
		for (int i = 0; i < string1.length(); i++) {
			boolean flag = true;
			for(int j = 0;j<stringBuffer.length();j++) {
				if(string1.charAt(i)==stringBuffer.charAt(j)) {
					flag = false ;
					stringBuffer.deleteCharAt(j);
					break;
				}
			}
			if(flag) return false;
		}
		return true;
	}
	
	public static boolean isAnagram1(String string1,String string2) {
		if(string1.length()!=string2.length()) return false;

		int charArray[] = new int[256];
		for (int i = 0; i < string1.length(); i++) {
			charArray[string1.charAt(i)]++ ;
		}
		for (int i = 0; i < string2.length(); i++) {
			charArray[string2.charAt(i)]--;
			if(charArray[string2.charAt(i)]<0) return false;
		}
		return true;
	}
	public static void reversWords(StringBuffer str) {
		String string[]=str.toString().split(" ");
		int lastIndex = 0;
		int firstIndex = 0;
		for (int i = 0; i < string.length; i++) {
			lastIndex+=string[i].length();
			str.replace(firstIndex, lastIndex, reverseString(string[i]));
			lastIndex++;
			firstIndex =lastIndex;
			
		}
	}
	public static void reverseSentences(StringBuilder stringBuilder) {
		String ss= "";
		int length = stringBuilder.length()-1;
		
		for (int i = stringBuilder.length()-1; i>=0 ; i--) {
			if(stringBuilder.charAt(i)==' '||i==0) {
				
				for (int j = i; j <= length ; j++) {
					ss += stringBuilder.charAt(j);
				}
				length  = length-(length-i);
				 
			}	
		}
		stringBuilder.replace(0, stringBuilder.length(), ss);
	}
	public static void reverseSentences1(StringBuilder stringBuilder) {
		String aString[] = stringBuilder.toString().split(" ");
		
		for (int i = 0;i<aString.length/2; i++) {
			 String tempString = aString[i]; 
			 aString[i]=aString[(aString.length-1)-i];
			 aString[(aString.length-1)-i] = tempString;
			 System.out.println(aString[i]);
			 System.out.println(aString[(aString.length-1)-i]);
		}
		int index=0;
		for (String arr:aString) {
			arr +=" ";
			stringBuilder.replace(index,arr.length()+index, arr);
			index += arr.length();
		}
	}

}