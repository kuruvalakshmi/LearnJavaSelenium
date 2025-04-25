package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WidowHandlingAndInteractionAutomation {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options =new ChromeOptions();
		options.addArguments("guest");
		//Initialize ChromeDriver
		ChromeDriver driver = new ChromeDriver(options);
		//Load the URL 
		driver.get("http://leaftaps.com/opentaps/control/login");
		//Maximize the browser window
		driver.manage().window().maximize();
		//Add an implicit wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//enter username
		driver.findElement(By.id("username")).sendKeys("Democsr");
    	 //enter password
    	 driver.findElement(By.id("password")).sendKeys("crmsfa");
    	 //click on login 
    	 driver.findElement(By.className("decorativeSubmit")).click();
    	 //click on crm/sfa
    	 driver.findElement(By.linkText("CRM/SFA")).click();
    	 //click on the contact
    	 driver.findElement(By.linkText("Contacts")).click();
    	 //click on merge contact
    	 driver.findElement(By.linkText("Merge Contacts")).click();
    	 //click on from contact widget
    	 driver.findElement(By.xpath("//img[@alt='Lookup'][1]")).click();
    	 
    	 Set<String> allwindows = driver.getWindowHandles();
    	
    	 List<String>windowaddress= new ArrayList<>(allwindows);
    	 Thread.sleep(1000);
    	 driver.switchTo().window(windowaddress.get(1));
    	 //click on first resulting contact
    	driver.findElement(By.linkText("ca1")).click();
    	
    	driver.switchTo().window(windowaddress.get(0));
    	
    	//click on the widget of to contact
    	driver.findElement(By.xpath("//input[@id='partyIdTo']/following-sibling::a")).click();
    	
    	Set<String> allwindow = driver.getWindowHandles();
         List<String>windowaddres = new ArrayList <>(allwindow);
         Thread.sleep(1000);
    	driver.switchTo().window(windowaddres.get(1));
    	
    	driver.findElement(By.xpath("//a[text()='ca2']")).click();
    	
    	driver.switchTo().window(windowaddres.get(0));
    	
    	//click on merge
    	 driver.findElement(By.xpath("//a[text()='Merge']")).click();
    	 
    	 //alert
    	 Alert alert = driver.switchTo().alert();
    	 alert.accept();
    	 
    	// verify title
    	 String Expectedtitle ="View Contact";
    	 String Actualtitle = driver.getTitle();
    	 
    	 if (Actualtitle.contains(Expectedtitle)) {
    		 System.out.println("Merge sucessful - Titled verified "+ Actualtitle);
    	 }
    	 else {
    		 System.out.println("Merge failed- Title unverified "+ Actualtitle );
    	 }
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
	}

}
