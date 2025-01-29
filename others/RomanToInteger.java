package others;

import java.util.HashMap;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int romanToInt1(String s) {
        if (s == null || s.isEmpty()) return 0;

        // Map to store Roman numeral values
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;

        // Loop through the Roman numeral string
        for (int i = 0; i < s.length(); i++) {
            int currentValue = romanMap.get(s.charAt(i));
            int nextValue = romanMap.get(s.charAt(i + 1));
            // Check if the next character exists and is greater in value
            if (currentValue < nextValue ) {
                result += nextValue - currentValue;
                i++; // Skip the next character
            } else {
                result += currentValue;
            }
        }

        return result;
    }

	    public int romanToInt(String s) {
	        HashMap<Character,Integer> a = new HashMap<>();
	        a.put('I',1);
	        a.put('V',5);
	        a.put('X',10);
	        a.put('L',50);
	        a.put('C',100);
	        a.put('D',500);
	        a.put('M',1000);
	        int count =0;
	        for(int i =0;i<s.trim().length();i++){
	            char c = s.charAt(i);
	            if(!(i==s.length()-1)){
	                char nextChar = s.charAt(i+1);
	                if((c=='I'&&nextChar=='V'||
	                		c=='I'&&nextChar=='X')||
	                		(c=='X'&&nextChar=='L'||
	                		c=='X'&& nextChar=='C')||
	                		(c=='C'&&nextChar=='D'||
	                		c=='C'&&nextChar=='M')){
	                	
	                    count += a.get(nextChar)-a.get(c) ;
	                    i++;
	                } else{
	                    count += a.get(c);
	                }
	            }else{
	              count += a.get(c);
	            }
	        
	        }
	        return count;
	    }
	}
public class RomanToInteger {
	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.romanToInt1("MDCCCLXXXVI"));
		
		
	}

}
