import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificBaseClass {
                   public ChromeDriver driver;

	        
	@BeforeMethod  
	public void precondition() {
             //launch browser
		    driver = new ChromeDriver();
		    //load url
		    driver.get("https://login.salesforce.com");
		    //maximize window
		    driver.manage().window().maximize();
		    //add implicit wait
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		    //enter the username
		    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("bhuvanesh.moorthy@testleaf.com");
		    //enter the password
		    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Testleaf@2025");
		    //click on login
		    driver.findElement(By.xpath("//input[@id='Login']")).click();
	}
@AfterMethod
     public void postcondition() {
		    driver.close();

	}

}
