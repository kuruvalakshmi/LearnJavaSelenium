package week3.day1;

public class ReverseOddWordsInString {


	public static void main(String[] args) {
		// split the word / have it an array
		String test= "I am a software tester";
		String[] split = test.split(" ");
	       //                  0    1   2     3         4
	    //   string[] split= {"I","am","a","software","tester"}
				//System.out.println(split[4]);
				
			//loop
			for(int i=0;i<split.length;i++) {
			
	         if(i %2 ==1) {
	        	 String outputString = ""; 
	      
	         for(int j=split[i].length()-1;j>=0;j--) {
	        	 outputString=outputString+split[i].charAt(j) ;
	         }
	         
	        	 System.out.print(outputString + " ");
	        	 }
	         
	        	 
	         else {
	        
	        	 System.out.print(split[i] + " ");
	         }
	        	 
	        	 }
				 
	        	 
	        	 
	}	}
	
