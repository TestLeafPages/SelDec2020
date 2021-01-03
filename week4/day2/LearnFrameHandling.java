package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrameHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		  driver.get("http://leafground.com/pages/frame.html");
		  
		  driver.switchTo().frame(1);  // outer frame
		  
		  driver.switchTo().frame(0); // what is the index for the inner frame
		  
		  driver.findElementById("Click1").click();
		  
		  
		  
		/*
		 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 * 
		 * //switch to frame using index driver.switchTo().frame(0); // index starts
		 * with 0 driver.findElementById("Click").click();
		 * 
		 * //method to come out of the frame and get into the main window
		 * driver.switchTo().defaultContent();
		 * 
		 * driver.findElementByTagName("h1").getText();
		 * 
		 * driver.switchTo().parentFrame();
		 */
		
		/*
		 * driver.get("https://dev68594.service-now.com/"); //switch to frame using Id
		 * or Name //driver.switchTo().frame("gsft_main123");
		 * 
		 * 
		 * WebElement mainFrame = driver.
		 * findElementByXPath("//iframe[@id='gsft_main' and @title='Main Content']");
		 * 
		 * driver.switchTo().frame(mainFrame);
		 * 
		 * driver.findElementById("user_name").sendKeys("admin");
		 * driver.findElementById("user_password").sendKeys("India@123");
		 * driver.findElementById("sysverb_login").click();
		 */
		

	}

}
