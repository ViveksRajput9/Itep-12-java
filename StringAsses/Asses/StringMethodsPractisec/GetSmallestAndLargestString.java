package StringAsses.Asses.StringMethodsPractisec;

public class GetSmallestAndLargestString {
	  public static String getSmallestAndLargest(String s, int k) {
	
	        
	        // Complete the function
	        // 'smallest' must be the lexicographically smallest substring of length 'k'
	        // 'largest' must be the lexicographically largest substring of length 'k'
	        
	        int arrayLength = (int) Math.ceil((double) s.length() / k);
	 
	        String[] substrings = new String[arrayLength];

	        for (int i = 0; i < arrayLength; i++) {

	            int start = i * k;

	            int end = Math.min(start + k, s.length()); // Ensure we don't go out of bounds

	            substrings[i] = s.substring(start, end);

	        }
	        for(int j= 1;j<substrings.length-1;j++){
	            if(substrings[j].compareTo(substrings[j+1])<0){
	                String temp = substrings[j+1];
	                substrings[j+1] = substrings[j];
	                substrings[j+1] = temp;
	            }
	        }
	        
	     
	        return substrings[0] + "\n" + substrings[substrings.length-1];
	    }
	  public static void main(String[] args) {
		System.out.println(getSmallestAndLargest("welcometojava", 3));
	}
}