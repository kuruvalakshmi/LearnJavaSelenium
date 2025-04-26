package week3.inheritance;

public class WebElement {
	
	public void click() {
        System.out.println("Element clicked");
	}
	     public void setText(String text) {
			System.out.println("Text");

		}
	
	public static void main(String[] args) {
		WebElement options = new WebElement();
		options.click();
		options.setText("String text");
		

	}

}
