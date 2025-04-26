package week3.inheritance;

public class CheckBoxButton extends Button {
	
	
	public void clickCheckButton() {
		System.out.println("Checked");

	}
	
	public static void main(String[] args) {
		 CheckBoxButton butOptions = new CheckBoxButton();
		 butOptions.setText("String text");
		 butOptions.click();
		 butOptions.submit();
		 butOptions.clickCheckButton();
		 
	}

}
