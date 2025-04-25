package week4.day1;

public class BasePage {
	
	
      public void findElement() {
    	  System.out.println("Finded");
		
	}
      public void clickElement() {
    	  System.out.println("clicked");
		

	}
      public void enterText() {
    	  System.out.println("Entered");
		
	}
      public void performCommonTasks() {
    	  System.out.println("Performed");
		
	}
      public static void main(String[] args) {
    	  BasePage pageOptions = new BasePage ();
    	  pageOptions.findElement();
    	  pageOptions.clickElement();
    	  pageOptions.performCommonTasks();
		
	}
}
