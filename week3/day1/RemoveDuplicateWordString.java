package week3.day1;

public class RemoveDuplicateWordString {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		String text = "we learn java basics as a part of java sessions in java week1" ;
       // split text into array of words
           String[] textSplit = text.split(" ");
           //nested for loop
           for (int i=0; i<textSplit.length;i++)  {
        	   
        	   for (int j=i+1; j<textSplit.length;j++) {
        	   if (textSplit[i].equals(textSplit[j])) {
        	   textSplit[j]="" ;
           }}
        	   {
        		   System.out.print(" "+textSplit[i]);
           
				


}
}
	
}}