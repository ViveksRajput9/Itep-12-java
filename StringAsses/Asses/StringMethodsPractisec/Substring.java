package StringAsses.Asses.StringMethodsPractisec;

import java.util.Scanner;

public class Substring {
	    public static void main(String[] args) {
	    	        Scanner in = new Scanner(System.in);
	    	        String S = in.next();
	    	        System.out.println(" Enter");
	    	        int start = in.nextInt();
	    	        int end = in.nextInt();
	    	        if(!S.matches(".*\\d.*")){
	    	            if(start>=0&&end <=S.length()){
	    	               System.out.println(S.substring(start,end));
	    	            }
	    	        }
//	        String str = "Aello";
//	        String str1 = "Bello";
//	        System.out.println(str1.compareTo(str));

	        // Loop through the string and print each character
//	        for (int i = 0; i < str.length(); i++) {
//	            String character = str.substring(i, i+1);
//	            System.out.println("Character at index " + i + ": " + character);
//	        }
	    }
	}

