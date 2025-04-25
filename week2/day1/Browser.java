package week2.day1;

public class Browser {
 public String launchBrowser(String browserName) {
	 System.out.println("Browser launched sucessfully");
		return browserName;
	}
 public void loadUrl() {
	 System.out.println("Url load sucessfully");
} 
 public static void main(String[] args) {
	Browser browOption=new Browser();
	browOption.launchBrowser("Chrome");
	System.out.println();
	browOption.loadUrl();
	
	
	
}
	
		
	

	}

