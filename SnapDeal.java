package week8.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDeal {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//launch url
		driver.get("https://www.snapdeal.com/");
		
		//implicit wait to wait for 30sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Thread.sleep(10000);
		
		WebElement eleMensFashion = driver.findElement(By.xpath("//span[contains(text(),'Fashion')]"));
		
		//step1 : create object for actions class
		Actions builder = new Actions(driver);
		
		//step2 : build the actions
		builder.moveToElement(eleMensFashion)
		.pause(Duration.ofSeconds(2))
		.click(driver.findElement(By.xpath("//span[text()='Shirts']")))
		.perform(); //perform() is mandatory at the end of the actions.
		
		WebElement eleHeart = driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-like-outline heart-icon animated-font-pre']"));
		
		builder.moveToElement(eleHeart)
		.pause(Duration.ofSeconds(1))
		.click(driver.findElement(By.xpath("//div[contains(text(),'Quick View')]")))
		.perform();
		
		
		
		
	}

}
