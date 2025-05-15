package week5.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatingFrameAndAlert {

	public static void main(String[] args) {
		// initialize browser
	 ChromeDriver driver=new ChromeDriver();
	 //load the url
	 driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
	 //maximize window
	 driver.manage().window().maximize();
	 //switch to frame 
	 driver.switchTo().frame("iframeResult");
	 // add implicit wait
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 //click on try it button
	 driver.findElement(By.xpath("//button[text()='Try it']")).click();
	 //handle alert
	 Alert alert = driver.switchTo().alert();
	 alert.accept();
	 //confirm the action
	String text = driver.findElement(By.xpath("//p[@id='demo']")).getText();
	 System.out.println(text);
	 
	 if (text.contains("pressed OK")){
		 System.out.println("Action Performed");
	 }
	 else {
		 System.out.println("Action Not Performed");
		 
	 }
		 //close window
	   driver.close();
	 }
	 

	}



