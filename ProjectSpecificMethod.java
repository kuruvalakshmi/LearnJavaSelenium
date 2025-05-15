import java.time.Duration;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ProjectSpecificMethod extends ProjectSpecificBaseClass {
@Test
	 public void runProjectSpecificMethod() throws InterruptedException {
		
	   
	    // click icon toggle menu
	    driver.findElement(By.xpath("//button[contains(@class,'slds-button slds-context-bar')]")).click();
	    //click view all
	    driver.findElement(By.xpath("//button[text()='View All']")).click(); 
	    //click on legal entities
	    Actions act =new Actions(driver);
	    WebElement legalentity = driver.findElement(By.xpath("//p[text()='Legal Entities']"));
	    Thread.sleep(1000);
	     act.scrollToElement(legalentity).perform();
	     legalentity.click();
	     //click on new
	    Thread.sleep(1000);
	     driver.findElement(By.xpath("//div[text()='New']")).click();
	     //enter name
	     driver.findElement(By.xpath("//div[@class='slds-form-element__control slds-grow']//input[@class='slds-input']")).sendKeys("sk");
	     //company name
	     driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("TestLeaf");
	     //describtion
	     driver.findElement(By.xpath("//label[text()='Description']/following-sibling::div/textarea")).sendKeys("'Salesforces");
	     Thread.sleep(1000);  
	     //select active status
	     WebElement element = driver.findElement(By.xpath("//button[(@class='slds-combobox__input slds-input_faux fix-slds-input_faux slds-combobox__input-value')]"));
	     driver.executeScript("arguments[0].click()",element);
	     driver.findElement(By.xpath("//span[@class='slds-media__body']//span[text()='Active']")).click();
	     //click save
	     driver.findElement(By.xpath("//button[text()='Save']")).click();
	  
	 }
//runProjectSpecificMethod-@Test
//precondition-@BeforeMethod
//postcondition-@Aftermethod

}
