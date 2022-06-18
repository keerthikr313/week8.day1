package week8.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnExplicitlyWait {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/appear.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//step1: create object for WebDriverWait
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		
		//step2: apply the expected condition
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//b[contains(text(),'Voila')]"))));
		
		String text = driver.findElement(By.xpath("//b[contains(text(),'Voila')]")).getText();
		
		System.out.println(text);
		
		
		
	}

}