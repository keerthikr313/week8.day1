package week8.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnClickAndHold {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//launch url
		driver.get("https://jqueryui.com/sortable/");
		
		//implicit wait to wait for 30sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//switch to frame
		driver.switchTo().frame(0);
		
		WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement item4 = driver.findElement(By.xpath("//li[text()='Item 4']"));

		
		Point location = item4.getLocation();
		
		int x = location.getX();
		int y = location.getY();
		
		//step1 : create object for actions class
		Actions builder = new Actions(driver);
				
		//step2 : build the actions
		builder.clickAndHold(item1).moveByOffset(x, y).release().perform(); //perform() is mandatory at the end of the actions
	}

}