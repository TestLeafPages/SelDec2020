package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlertHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Alert.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElementByXPath("//button[text()='Alert Box']").click();

		// switch the control to alert
		Alert alert = driver.switchTo().alert();

		// method to get the alert message
		String alertMsg = alert.getText();
		System.out.println(alertMsg);
		
		// method to click ok in alert
		alert.accept();
		
		driver.findElementByXPath("//button[text()='Confirm Box']").click();
		
		driver.switchTo().alert().dismiss();
		
		driver.findElementByXPath("//button[text()='Prompt Box']").click();
		
		Alert alert2 = driver.switchTo().alert();
		alert2.sendKeys("Hari");
		
		Thread.sleep(5000);
		alert2.accept();
		
		driver.findElementByXPath("//button[text()='Sweet Alert']").click();
		driver.findElementByXPath("//button[text()='OK']").click();
		

	}

}
