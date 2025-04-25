package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=123;
		int inputNum = num;
		int outputNum = 0;
		for (int i=inputNum; i > 0; i = i / 10) {
			int digit = i%10;
			outputNum=outputNum*10+digit;
			
		}
		if(num==outputNum) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
			
		}
		
      
	}
}
      