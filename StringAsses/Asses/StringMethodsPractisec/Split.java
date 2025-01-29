package StringAsses.Asses.StringMethodsPractisec;

public class Split {

	public static void main(String args[]) {
//		String s2 = "java string split method by javatpoint";
//		String[] words = s2.split("\\s");// splits the string based on whitespace
//		// using java foreach loop to print elements of string array
//		for (String w : words) {
//			System.out.println(w);
//		}
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		
		
		String s1="welcome to split world";  
		System.out.println("returning words:");  
		for(String w:s1.split("\\s",0)){  
		System.out.println(w);  
		}  
		System.out.println();
		System.out.println();
		System.out.println("returning words:");  
		for(String w:s1.split("\\s",3)){  
		System.out.println(w);  
		}  	
		System.out.println();
		System.out.println();
		System.out.println("returning words:");  
		for(String w:s1.split("\\s",4)){  
		System.out.println(w);  
		}  
	}
}
