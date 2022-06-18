package week8.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiSelectDropdown {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//launch url
		driver.get("http://leafground.com/pages/Dropdown.html");
		
		//implicit wait to wait for 30sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				
		WebElement program1 = driver.findElement(By.xpath("//option[text()='Select your programs']/following::option[text()='Selenium']"));
		WebElement program4 = driver.findElement(By.xpath("//option[text()='Select your programs']/following::option[text()='Loadrunner']"));
				
		//step1 : create object for actions class
		Actions builder = new Actions(driver);
						
		//step2 : build the actions
		builder
		.keyDown(Keys.CONTROL)
		.click(program1)
		.click(program4)
		.keyUp(Keys.CONTROL)
		.perform(); //perform() is mandatory at the end of the actions
	}

}