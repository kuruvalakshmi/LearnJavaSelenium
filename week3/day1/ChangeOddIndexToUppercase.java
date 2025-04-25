package week3.day1;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		
		      String word = "changeme";
		
			
			for(int i=0 ; i<word.length() ;i++) {
			char ch = word.charAt(i);
				if (i%2 !=0) {
					
					System.out.print(Character.toUpperCase(ch));
				
			   	}
				
				else {
					word.charAt(i);
					System.out.print(word.charAt(i));
       
              }
              
					
				}
	
		
	
    
	}}
          



	
	
	
	
	
	
	