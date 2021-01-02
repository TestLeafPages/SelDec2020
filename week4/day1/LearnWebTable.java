package week4.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWebTable {

	public static void main(String[] args) {
		// precondition: to start the WebDriver
		WebDriverManager.chromedriver().setup();

		// Step1: Open chrome browser
		ChromeDriver driver = new ChromeDriver();
		// FirefoxDriver driver = new FirefoxDriver();

		// Step2: Maximize the browser
		driver.manage().window().maximize();

		// Step3: Load the application url

		driver.get("http://leafground.com/pages/table.html");
		
		List<WebElement> allRows = driver.findElementsByXPath("//table[@id='table_id']//tr");
		int rowSize = allRows.size();
		
				
		for (int i = 2; i <= rowSize; i++) {
					
			List<WebElement> allCells = driver.findElementsByXPath("//table[@id='table_id']//tr["+i+"]/td");
			int cellCount = allCells.size();

			for (int j = 1; j <= cellCount; j++) {
				
				String text = driver.findElementByXPath("//table[@id='table_id']//tr["+i+"]/td["+j+"]").getText();
				System.out.println(text);
			}
			
		}
		
		
		
		

	}

}
