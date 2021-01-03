package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnExplicitlyWait {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		/*
		 * driver.get("http://leafground.com/pages/appear.html");
		 * 
		 * //create object for WebDriverWait WebDriverWait wait = new
		 * WebDriverWait(driver,Duration.ofSeconds(2));
		 * 
		 * // wait // .until(ExpectedConditions.visibilityOf(driver.findElementByXPath(
		 * "//b[contains(text(),'Voila')]"))).getText();
		 * 
		 * 
		 * String text =
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
		 * "//b[contains(text(),'Voila')]"))).getText(); System.out.println(text);
		 */
		
		
		driver.get("http://leafground.com/pages/disapper.html");
		
		WebElement disappearElement = driver.findElementByXPath("//*[contains(text(),'Keep looking at me!')]");
			
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		 wait.until(ExpectedConditions.invisibilityOf(disappearElement));
		 
		 String text = driver.findElementByTagName("strong").getText();
		 System.out.println(text);
		
		
		
		
		
		
	}

}
