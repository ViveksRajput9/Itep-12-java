package others;

import java.util.Scanner;
 interface solution12{
	  public static int strStr(String haystack, String needle) {
 	        int haystackLength = haystack.length();
	        int needleLength = needle.length();

	        if(haystack.isEmpty()||needle.isEmpty()|| needleLength>haystackLength ) return -1;
	        if(haystack.equals(needle)) return 0;
	        int i = haystack.indexOf(needle.charAt(0));
	        while(i<haystackLength){
	            if(haystack.substring(i,i+needleLength).equals(needle)) return i;
	            i++;
	        }
	        return -1;
	    }
}
public class FindTheIndexOfFirstOccurence {
	
	  public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = "abc sadf as";
		String string = "c";
        int a=  s.length()-s.lastIndexOf(" ")-1;
        System.out.println(a);
	    System.out.println(solution12.strStr(s, string));
		
	}
}