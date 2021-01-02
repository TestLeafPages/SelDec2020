package week4.day1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAUI {

	public static void main(String[] args) throws InterruptedException {
		// precondition: to start the WebDriver
		WebDriverManager.chromedriver().setup();

		// Step1: Open chrome browser
		ChromeDriver driver = new ChromeDriver();
		// FirefoxDriver driver = new FirefoxDriver();

		// Step2: Maximize the browser
		driver.manage().window().maximize();

		// Step3: Load the application url

		driver.get("http://leafground.com/pages/selectable.html");
		
		Thread.sleep(2000);
		
		WebElement item1 = driver.findElementByXPath("//li[text()='Item 1']");
		WebElement item3 = driver.findElementByXPath("//li[text()='Item 3']");
		WebElement item5 = driver.findElementByXPath("//li[text()='Item 5']");
		
		//WebElement source = driver.findElementById("draggable");
		//WebElement target = driver.findElementById("droppable");
		
		Actions builder = new Actions(driver);
		
		builder.keyDown(Keys.CONTROL).click(item1).click(item3).click(item5).keyUp(Keys.CONTROL).perform();
		
		//builder.clickAndHold(item1).moveToElement(item4).release().perform();
		
		//builder.dragAndDrop(source, target).perform();
		
		//builder.dragAndDropBy(source, 100, 200).perform();
		
	//	WebElement men = driver.findElementByLinkText("Men");
	//	WebElement men = driver.findElementByXPath("//a[text()='Men']");
		
		//Create object for Actions class
	//	Actions builder = new Actions(driver);
		//builder.moveToElement(men).perform();
		
		//to diuble click
		//builder.doubleClick(men).perform();
		
		//to right click
	//	builder.contextClick(men).perform();
		
		//move to a point and click
	//	builder.moveByOffset(100, 200).click().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

	}

}
