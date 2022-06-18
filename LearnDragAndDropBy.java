package week8.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDragAndDropBy {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//launch url
		driver.get("https://jqueryui.com/draggable/");
		
		//implicit wait to wait for 30sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//switch to frame
		driver.switchTo().frame(0);
		
		WebElement source = driver.findElement(By.id("draggable"));
		
		Point location = source.getLocation();
		
		int x = location.getX();
		int y = location.getY();
		
		//step1 : create object for actions class
		Actions builder = new Actions(driver);
				
		//step2 : build the actions
		builder.dragAndDropBy(source, x+50, y+100).perform(); //perform() is mandatory at the end of the actions
	}

}