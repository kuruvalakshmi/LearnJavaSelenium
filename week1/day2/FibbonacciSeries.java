package week1.day2;

public class FibbonacciSeries {
	public static void main(String[] args) {
		// To print the fibbanocci series specified range 0-13
		int a=0; 
		int b=1; 
		// 0 1 1 2 3 5 8 13
		//loop number 1
		for(int fibo=0;fibo<8;fibo++)  {
			int newfibo=a+b;
			System.out.println(a);
			b=a;
			a=newfibo;
			
		}

	}

}


