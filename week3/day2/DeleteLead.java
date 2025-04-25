package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		// initialize driver
		ChromeDriver driver = new ChromeDriver(options);
		//load url
		driver.get("http://leaftaps.com/opentaps/");
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//maximize browser window
		driver.manage().window().maximize();
		//enter the username
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
        //enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//click on login button
		driver.findElement(By.className("decorativeSubmit")).click();
		//Click the "crm/sfa" 
		driver.findElement(By.linkText("CRM/SFA")).click();
		//Click the "Leads"
		driver.findElement(By.linkText("Leads")).click();
		//click on link text
		driver.findElement(By.linkText("Find Leads")).click();
		//click on phone button
		driver.findElement(By.linkText("Phone")).click();
		//enter phone number
		driver.findElement(By.name("phoneNumber")).sendKeys("275799");
		Thread.sleep(1000);
			
		//click on find leads
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//Eter captured leadid
		String firstLead = driver.findElement(By.xpath("//a[text()='10108']")).getText();
		System.out.println("First lead ID "+ firstLead);
		String ID = firstLead.replaceAll("[^0-9]", "");
		System.out.println(ID);
		Thread.sleep(1000);
		//click on lead button
		driver.findElement(By.xpath("//a[text()='10108']")).click();
		//click on delete button
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		//click on find leads again
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		Thread.sleep(1000);
		//enter captured lead id
		driver.findElement(By.xpath("//div[@class='x-form-element']/input[1]")).sendKeys("10108");
		//click on find lead
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
		String screenResult = driver.findElement(By.className("x-paging-info")).getText();
		System.out.println(screenResult);
		String Result= "No records to display";
		if (screenResult.equals(Result)) 
			System.out.println("Record Deleted");
		else 
			
		System.out.println("Record Not Deleted ");
	    
}	
	}


