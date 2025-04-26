package week3.inheritance;

public class TextField extends WebElement {
	
	
	   public void getText() {
		System.out.println("Get");

	}
	

	public static void main(String[] args) {
		TextField textOptions = new TextField();
		textOptions.getText();
		textOptions.click();
		textOptions.setText("String text");

	}

}
