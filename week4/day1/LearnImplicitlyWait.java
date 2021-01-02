package week4.day1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnImplicitlyWait {

	public static void main(String[] args) throws InterruptedException {
		// precondition: to start the WebDriver
		WebDriverManager.chromedriver().setup();

		// Step1: Open chrome browser
		ChromeDriver driver = new ChromeDriver();
		// FirefoxDriver driver = new FirefoxDriver();
		
		//implicitly wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Step2: Maximize the browser
		driver.manage().window().maximize();

		// Step3: Load the application url

		driver.get("http://leaftaps.com/opentaps/control/main");
		
		
		//Thread.sleep(5000);
		
		driver.findElementById("username").sendKeys("Demosalesmanager");
		
		
		driver.findElementById("password123").sendKeys("crmsfa");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

	}

}
