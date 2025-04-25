package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.core.backend.Options;

public class EditLead {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
	     options.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(options);
		//load url
		driver.get("http://leaftaps.com/opentaps/.");
		//maximize window
		driver.manage().window().maximize();
		//implicit
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		//company name by xpath
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Testleaf");
		//firstname by xpath
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("kuru");
		//enter last name 
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("lakshmi");
		//enter first name local
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("abc");
		//enter deparment
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("IT");
		//enter description 
		driver.findElement(By.id("createLeadForm_description")).sendKeys("automation");
		//enter mail
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("kuruvalakshmi30596@gmail.com");
		//select state
		WebElement sourceWebElement = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dropdown = new Select (sourceWebElement);
		dropdown.selectByVisibleText("New Mexico");
		//click on create lead
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		//click on edit button
		driver.findElement(By.linkText("Edit")).click();
		//Clear description
		driver.findElement(By.id("updateLeadForm_description")).clear();
		//fill the important feild
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("abcdefg");
		//click on update
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		String titleOfpage = driver.getTitle();
		System.out.println(titleOfpage);
		
		//close browser window
		driver.quit();
		
		

	}

}
