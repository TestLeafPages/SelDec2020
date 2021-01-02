package week4.day1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Erail {

	public static void main(String[] args) throws InterruptedException {
		// precondition: to start the WebDriver
		WebDriverManager.chromedriver().setup();

		// Step1: Open chrome browser
		ChromeDriver driver = new ChromeDriver();
		// FirefoxDriver driver = new FirefoxDriver();

		// Step2: Maximize the browser
		driver.manage().window().maximize();

		// Step3: Load the application url

		driver.get("https://erail.in/");
		
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("mas");
		driver.findElementById("txtStationFrom").sendKeys(Keys.TAB);
		
		
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("sbc");
		driver.findElementById("txtStationTo").sendKeys(Keys.TAB);
		
		driver.findElementById("chkSelectDateOnly").click();
		
		Thread.sleep(2000);
		
		
		List<WebElement> allRows = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr");
		
		int rowSize = allRows.size();
		
		List<String> trainNames = new ArrayList<String>();
		
		for (int i = 1; i <= rowSize; i++) {
			
			String trainName = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr["+i+"]/td[2]").getText();
			trainNames.add(trainName);
		}
		
		
		
		Set<String> uniqueNames = new LinkedHashSet<String>(trainNames);
		
		if(trainNames.size() == uniqueNames.size() ) {
			System.out.println("there is no duplicate");
		}
		else {
			System.out.println("Duplicate train names are there");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
