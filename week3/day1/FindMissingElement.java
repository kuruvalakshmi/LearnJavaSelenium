package week3.day1;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
	         int[]	Number = {1, 4,3,2,8, 6, 7};
	           //sort the array
	           Arrays.sort(Number);
	           //for loop
	           for(int i=1; i<=Number.length; i++) {
	            if (i !=Number[i-1]) {
	            	System.out.print("Number "+ i);
	            	break;

	}

}
}}