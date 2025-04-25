package week4.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		  String[] text = {"HCL","Wipro","Aspire Systems", "CTS" };
		  List<String>newText= new ArrayList<String>(Arrays.asList(text));
		  Collections.sort(newText);
		  for(int i=newText.size()-1;i>=0;i--) {
			
			  System.out.println(newText.get(i)+ ",");
		 
	}

}
}