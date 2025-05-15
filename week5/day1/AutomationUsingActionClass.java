package week5.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationUsingActionClass {

	public static void main(String[] args) throws InterruptedException {
		//initialize browser
		ChromeDriver driver =new ChromeDriver();
		//load the url
		driver.get("https://www.amazon.in/");
		//maximize the browser
		driver.manage().window().maximize();
		//add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//search for oneplus 9 pro
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro");
		driver.findElement(By.id("nav-search-submit-button")).click();
		//get the price of first product
		String price =driver.findElement(By.xpath("//span[@class='a-price-whole'][1]")).getText();
		System.out.println("The price of product is " +price);
		//click on ratings
	    driver.findElement(By.xpath("//i[@class='a-icon a-icon-popover'][1]")).click();
	  //print the ratings
	    String ratings =  driver.findElement(By.xpath("//div[@class='a-row a-spacing-medium']//span")).getText();
	    System.out.println("Number of Ratings "+ ratings);
	    Thread.sleep(1000);
	     //click on first link
      	driver.findElement(By.xpath("//h2[@class='a-size-medium a-spacing-none a-color-base a-text-normal']//span")).click();
	   //window handle
	    Set<String> windowHandles = driver.getWindowHandles();
	    List<String>windows= new ArrayList<String>(windowHandles);
	    driver.switchTo().window(windows.get(1));
	    Thread.sleep(1000);
	    //click on add to cart button
	    driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
	    //get the subtotal and verify
	   String subtotal = driver.findElement(By.xpath("//div[@class='a-column a-span11 a-text-left a-spacing-top-large']//span[@id='attach-accessory-cart-subtotal']")).getText();
	    System.out.println("Cart SubTotal "+ subtotal);
	    
	   if(subtotal.contains("299")) {
	   	System.out.println("Total Verified ");
	    }
	    else {
	   	System.out.println("Not verified");
	    }
	   driver.quit();
	    }

}
