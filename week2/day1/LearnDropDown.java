package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDropDown {

	public static void main(String[] args) throws InterruptedException {

		// precondition: to start the WebDriver
		WebDriverManager.chromedriver().setup();

		// Step1: Open chrome browser
		ChromeDriver driver = new ChromeDriver();
		// FirefoxDriver driver = new FirefoxDriver();

		// Step2: Maximize the browser
		driver.manage().window().maximize();

		// Step3: Load the application url
		driver.get("http://leaftaps.com/opentaps/control/main");

		// Step4: Enter username
		// WebElement username = driver.findElementById("username");
		// username.sendKeys("demosalesmanager");

		driver.findElementByTagName("input").sendKeys("demosalesmanager");

		// Step5: Enter password
		// driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");

		// Step6: Click login button
		driver.findElementByClassName("decorativeSubmit").click();

		// Step7: click on CRM/SFA link
		// driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByPartialLinkText("SFA").click();

		// Step8: click on Leads link 
		driver.findElementByLinkText("Leads").click();

		driver.findElementByLinkText("Create Lead").click();

		// locate the element with select tag (parent)
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");

		// pass the select tag webelement to select class
		Select dd = new Select(source);

		//dd.selectByVisibleText("Conference");
		//dd.selectByValue("LEAD_DIRECTMAIL");
		dd.selectByIndex(1);
		
		
		WebElement marketing = driver.findElementById("createLeadForm_marketingCampaignId");
		Select dd1 = new Select(marketing);
		dd1.selectByVisibleText("Car and Driver");
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
