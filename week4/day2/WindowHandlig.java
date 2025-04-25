package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class WindowHandlig {
	public static void main(String[] args)  {
		//initialize browser
		ChromeDriver driver = new ChromeDriver();
		//load url
		driver.get("https://www.irctc.co.in/");
		//maximize the window
		driver.manage().window().maximize();
		//add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	
		//click on the flight
		driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
		
		//capture title of new window
		Set<String> allWindowsAddress = driver.getWindowHandles();
		System.out.println("The address of all window is "+ allWindowsAddress);
		
		List<String>addressOfWindow = new ArrayList<String>(allWindowsAddress);
		
		driver.switchTo().window(addressOfWindow.get(1));
		
		String titleofChildWindow = driver.getTitle(); 
			System.out.println("The title of child window is  "+ titleofChildWindow);
		
		
		driver.switchTo().window(addressOfWindow.get(0));
		
		driver.close();
		
		
		
	
		     
	}
		
	}


