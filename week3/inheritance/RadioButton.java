package week3.inheritance;

      public class RadioButton extends Button {
    	  public void selectRadioButton() {
			System.out.println("Selected");

		}

	public static void main(String[] args) {
		RadioButton butOptions = new RadioButton();
		butOptions.selectRadioButton();
		butOptions.setText("String text");
		butOptions.click();
		butOptions.submit();

	}

}
