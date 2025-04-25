package week3.day1;

import java.util.Arrays;

public class FindIntersectionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numa[]={3,2,11,4,6,7};
		 int numb[]= {1,2,8,4,9,7};
		 
		Arrays.sort(numa) ;
		 Arrays.sort(numb);
		 {
			 for(int i=0;i<numa.length;i++) {
				 for (int j=0;j<numb.length;j++) {
	
				if(numa [i]== numb [j]) {
					System.out.println("Matching element  "+ numa[i]);
				}
				 
				 }
	
				 
				 
				 
				 
				 
				 
				 }}
}}