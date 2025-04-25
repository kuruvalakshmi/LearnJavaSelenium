package week3.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class PvrCinema {

	public static void main(String[] args) throws InterruptedException {
		// launch browser
		ChromeDriver driver = new ChromeDriver(); 
		//load the url
		driver.get( "https://www.pvrcinemas.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(1000);
	//	driver.findElement(By.xpath("//input[@placeholder='Search for city']")).click();
	    // driver.findElement(By.xpath("//h6[text()='Chennai']")).click();
	 driver.findElement(By.xpath("//span[text()='Cinema']")).click();
	 driver.findElement(By.xpath("//span[contains(text(),'Select Cinema')]")).click();
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//li[@class='p-dropdown-item']/span")).click();
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//span[text()='Tomorrow']")).click();
	 driver.findElement(By.xpath("//span[text()='GYMKHANA']")).click();
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//ul[@class='p-dropdown-items']")).click();
	 driver.findElement(By.xpath("//button[@type='submit']")).click();
	 
    driver.findElement(By.xpath("//button[text()='Accept']")).click();
	 
	 driver.findElement(By.xpath("//td[@class='seats-col']/span[@id='CL.CLUB|J:18']")).click();
	 //click on proceed button
	 driver.findElement(By.xpath("//button[text()='Proceed']")).click();
	// find the seat info
	String seatInfo = driver.findElement(By.xpath("//div[@class='seat-number']")).getText();
	 System.out.println(seatInfo);
	 //print ticketprice
	 String ticketprice = driver.findElement(By.xpath("//div[@class='ticket-price']/p")).getText();
	 System.out.println(ticketprice);
	 //print grandtotal
	 
	 
	 
	 
	 
	 
	}

}
