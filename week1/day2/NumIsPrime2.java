package week1.day2;

public class NumIsPrime2 {

	public static void main(String[] args) {
		int num=35;
		boolean prime=true;
		for(int i=2;i<35;i++) 
			if(num%2==0) {
			System.out.println("non prime");
		     prime=false;
		     break;
			}
			else {
				
				System.out.println("prime");
				prime=true;
				break;
						
				
			}
		
	}

}
