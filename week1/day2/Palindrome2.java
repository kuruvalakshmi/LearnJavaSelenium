package week1.day2;

public class Palindrome2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int num=15551;
  
   int outputNum=0;
   for(int i=num;i>0; i=i/10) {
 int digit=i%10;
  outputNum =outputNum * 10 + digit;
		  }
   if(num==outputNum) {
	   System.out.println("palindrome");
   }else {
	   System.out.println("not palindrome");
   }
   
   
	}

}
