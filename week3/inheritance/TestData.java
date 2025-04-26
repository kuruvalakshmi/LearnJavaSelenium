package week3.inheritance;

public class TestData {
	
	
	   public void enterCredential() {
		 System.out.println("Entered");

	}
	   public void navigateToHomePage() {
		System.out.println("Navigate");

	}

	public static void main(String[] args) {
		TestData credents = new TestData();
          credents. enterCredential();
          
  		 credents.navigateToHomePage();
	}

}
