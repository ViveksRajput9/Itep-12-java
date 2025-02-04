package others;

public class LongestCommonPrefixAdvance {
    public static String longestCommonPrefix(String[] strs) {
    	  if (strs == null || strs.length == 0) {
          return "";
      }

      for (int i = 0; i < strs[0].length(); i++) {
          char currentChar = strs[0].charAt(i);
          for (int j = 1; j < strs.length; j++) {
              if ( strs[j].charAt(i) != currentChar) {
                  return strs[0].substring(0, i); 
              }
          }
      }
      return strs[0];
  }
	public static void main(String[] args) {
		String[] string ={"flower","flogw","flight"};
		String aString = longestCommonPrefix(string);
		System.out.println(aString);

	}

}
