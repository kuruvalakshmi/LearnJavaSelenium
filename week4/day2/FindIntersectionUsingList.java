package week4.day2;

import java.util.ArrayList;
import java.util.List;

public class FindIntersectionUsingList {

	public static void main(String[] args) {
		  int[] numA={3, 2, 11, 4, 6, 7};
		  int[]numB={1, 2, 8, 4, 9, 7};
		  
		  List<Integer>listA=new ArrayList<Integer>();
		  for (int i=0;i<numA.length;i++) {
		  listA.add(numA[i]);
	}
		  for(int i=0;i<numB.length;i++) {
		if (listA.contains(numB[i]))  {
		System.out.print(numA[i]+ " ");
				
			  
		  }

}
}}