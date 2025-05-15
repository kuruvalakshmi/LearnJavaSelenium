package week5.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtableInteractionAndDataVerification {

	public static void main(String[] args) throws InterruptedException {
		
		//initialize the ChromeDriver
		ChromeDriver driver= new ChromeDriver();
		//load url
		driver.get("https://erail.in");
		//maximize window
		driver.manage().window().maximize();
		//add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//enter MAS From station
		WebElement fromStation = driver.findElement(By.id("txtStationFrom"));
		fromStation.clear();
		fromStation.sendKeys("MAS",Keys.TAB);
		Thread.sleep(1000);
		//enter MDU To station
		WebElement toStation = driver.findElement(By.id("txtStationTo"));
		toStation.clear();
		toStation.sendKeys("MDU",Keys.TAB);
		Thread.sleep(1000);
		//Un check the date sort on date
		WebElement checkBox = driver.findElement(By.id("chkSelectDateOnly"));
		if(checkBox.isSelected()) {
			checkBox.click();
}        Thread.sleep(1000);
		List<WebElement>trainName = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr/td[2]"));
	      int trainNamesize =trainName.size();
		for(int i=0; i<trainNamesize;i++) {
			String trains = trainName.get(i).getText();
	          System.out.println("Total Train name "+ trains );
					}
	
		
		
	}

}
