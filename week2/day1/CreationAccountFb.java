package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreationAccountFb {

	public static void main(String[] args) {
		// launch the browser
				ChromeDriver driver = new ChromeDriver();
				// load the url
				driver.get("https://www.facebook.com/");
				// maximize the browserwindow
				driver.manage().window().maximize();
				// implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				//click the create new account button
				driver.findElement(By.linkText("Create new account")).click();
				//Enter the first name
				driver.findElement(By.name("firstname")).sendKeys("Kuruva");
				//enter the surename
				driver.findElement(By.name("lastname")).sendKeys("lakshmi");
				//enter the m.no/mail id
				driver.findElement(By.name("reg_email__")).sendKeys("kuruvalakshmi30596@gmail.com");
				//enter the new password
				driver.findElement(By.id("password_step_input")).sendKeys("kuru@1996");
				
				//handling dropdown
				WebElement sourceElement = driver.findElement(By.id("day"));
				Select dropdown=new Select (sourceElement);
			    dropdown.selectByIndex(29);
			    
			   WebElement sourElement = driver.findElement(By.id("month"));
			   Select dropdown1=new Select(sourElement);
			   dropdown1.selectByValue("8");
			   
			   WebElement sourceWebElement = driver.findElement(By.id("year"));
			   Select dropdown2=new Select(sourceWebElement);
			   dropdown2.selectByValue("1996");
			   
			  // select the gender
			   driver.findElement(By.xpath("//label[text()='Female']")).click();
	}
			   
			   
			   
			   
	
				
				
			
				
				
				
				
	}


