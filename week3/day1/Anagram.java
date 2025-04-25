package week3.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text1="stops" ;
		String text2="potss" ; 
		      boolean Anagram = true;
			if (text1.length() == text2.length()) {
			//array
		    char[] tex1 = text1.toCharArray();
	        char[] tex2 = text2.toCharArray();
	        //sort
	        Arrays.sort(tex1);
	        Arrays.sort(tex2);
		    Anagram=Arrays.equals(tex1, tex2);
			
		
			
					if (Anagram) {
					System.out.println("The given strings are Anagram");
					}
					else {
						
						System.out.println("The given strings are not anagram");
					}
				}

			}}
