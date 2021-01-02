package week4.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnToHandleMultipleElements {

	public static void main(String[] args) {
		// precondition: to start the WebDriver
		WebDriverManager.chromedriver().setup();

		// Step1: Open chrome browser
		ChromeDriver driver = new ChromeDriver();
		// FirefoxDriver driver = new FirefoxDriver();

		// Step2: Maximize the browser
		driver.manage().window().maximize();

		// Step3: Load the application url

		driver.get("http://leaftaps.com/opentaps/control/main");

	//	List<WebElement> allInputTags = driver.findElementsByTagName("input");
		List<WebElement> allElements = driver.findElementsByClassName("inputLogin");

		System.out.println(allElements.size());

		for (WebElement eachWebElement : allElements) {

			String attribute = eachWebElement.getAttribute("name");
			System.out.println(attribute);

		}

		/*
		 * driver.get("http://leafground.com/pages/Link.html"); int size =
		 * driver.findElementsByTagName("a").size();
		 * System.out.println("No of links: "+size);
		 */

	}

}
