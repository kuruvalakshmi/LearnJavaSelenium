package week3.inheritance;

public class LogINTestData  extends TestData{
	
	
	
	public void enterUsername() {
		System.out.println("UserName");
			}
         public void enterPassword() {
			System.out.println("Password");

				}
	
	       public static void main(String[] args) {
		   LogINTestData inputs =new LogINTestData();
            inputs.enterUsername();
            inputs.enterPassword();
            inputs.enterCredential();
            inputs.navigateToHomePage();
	}
	

}
