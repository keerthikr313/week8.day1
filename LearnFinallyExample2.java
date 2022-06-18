package week8.day1;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFinallyExample2 {
	
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		try {
			driver.findElement(By.id("username123")).sendKeys("DemoSalesManager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");	
			}
		finally {
				Runtime.getRuntime().exec("taskkill / f / im chromedriver.exe");
				//it will stop running the chrome if it is giving wrong username or password and will not execute further 
		}
		
		System.out.println("End of program");
	}

}
