package week4.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestNumberUsingList {

	public static void main(String[] args) {
	     int[]   numbers = {3, 2, 11, 4, 6, 7};
	     List<Integer>numlist=new ArrayList<Integer>();
	     for(int i=0;i<numbers.length;i++) {
	     numlist.add(numbers[i]);
	     }
	     Collections.sort(numlist);
	     System.out.println(numlist);
	     int length=numlist.size();
	     
	     
         System.out.println(numlist.get(length-2));
	}

}