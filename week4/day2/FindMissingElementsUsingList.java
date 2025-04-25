package week4.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMissingElementsUsingList {

	public static void main(String[] args) {
		   int [] numbers= {1, 2, 3, 4, 10, 6, 8};
		   List<Integer>newnumbers=new ArrayList<Integer>();
		   for (int i=0;i<numbers.length ;i++) {
			   newnumbers.add(numbers[i]);
			   }
		    Collections.sort(newnumbers);
		    System.out.println(newnumbers);
		    //[1, 2, 3, 4, 6, 8, 10]
		    for(int i=0;i<newnumbers.size();i++) {
		    if(newnumbers.get(i) !=i+1) {
             System.out.println(i+1+" ");

	}

	}}}
