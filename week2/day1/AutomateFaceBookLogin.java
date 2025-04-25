package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateFaceBookLogin {

	public static void main(String[] args) {
		//launch the browser
		ChromeDriver driver= new ChromeDriver();
		// load the url
		driver.get("https://www.facebook.com/");
		
		//enter the mail id
		driver.findElement(By.id("email")).sendKeys(" testleaf.2023@gmail.com");
		//enter the password
		driver.findElement(By.id("pass")).sendKeys(" Tuna@321");
		//click on the login button
		driver.findElement(By.name("login")).click();
		//click on the find your account /login
		driver.findElement(By.xpath("//*[@id=\"email_container\"]/div[2]/a")).click();
		
		//verify the title
		String titleOfPage = driver.getTitle(); 
		System.out.println("Title of the page is: "+titleOfPage);
		
		
			}
		
		}
			
				
				
			
		
		

	

