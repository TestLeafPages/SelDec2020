package week2.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginLeaftaps {

	public static void main(String[] args) throws InterruptedException  {
		
		//precondition: to start the WebDriver
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.firefoxdriver().setup();
		
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				
		// Step1: Open chrome browser
		ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		
		//Step2: Maximize the browser
		driver.manage().window().maximize();
		
		//Step3: Load the application url
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//Step4: Enter username
		//WebElement username = driver.findElementById("username");
	//	username.sendKeys("demosalesmanager");
		
		//driver.findElementByTagName("input").sendKeys("demosalesmanager");
		driver.findElementByXPath("//input[@id='username']").sendKeys("demosalesmanager");
		
		
		  //Step5: Enter password
		  //driver.findElementById("password").sendKeys("crmsfa");
		  driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		  
		  //Step6: Click login button
		  driver.findElementByClassName("decorativeSubmit").click();
		  
		  //Step7: click on CRM/SFA link
		  //driver.findElementByLinkText("CRM/SFA").click();
		  driver.findElementByPartialLinkText("SFA").click();
		  
		  //Step8: click on Leads link driver.findElementByLinkText("Leads").click();
		  
		  driver.findElementByLinkText("Create Lead").click();
		  
		  driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
		  
		  driver.findElementById("createLeadForm_firstName").sendKeys("Hari");
		  
		  driver.findElementById("createLeadForm_lastName").sendKeys("R");
		  
		  driver.findElementByName("submitButton").click();
		 
		
		
		//java wait
		//Thread.sleep(2000);
		
		//Step7: to close the browser
		//driver.close();



	}

}
