package week8.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnMoveToElement {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//launch url
		driver.get("https://www.myntra.com/");
		
		//implicit wait to wait for 30sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement eleMen = driver.findElement(By.xpath("//a[text()='Men']"));
		
		//step1 : create object for actions class
		Actions builder = new Actions(driver);
		
		//step2 : build the actions
		builder.moveToElement(eleMen).perform(); //perform() is mandatory at the end of the actions.
		
	}

}
