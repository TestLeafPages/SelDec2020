package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GenericWrapper {
	
	public RemoteWebDriver driver;
	public WebDriverWait wait;
	
	public void lauchBrowser(String browser, String url) {
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public WebElement locateElement(String locator, String locValue) {
		switch (locator) {
		case "id": return driver.findElementById(locValue);
		case "class": return driver.findElementByClassName(locValue);
		case "xpath": return driver.findElementByXPath(locValue);
		}
		return null;
	}
	
	public void enterValue(WebElement ele, String data) {
		try {
			ele.sendKeys(data);
			System.out.println("pass");
		} catch (Exception e) {
			System.out.println("fail");
		}
	}
	
	public void click(WebElement ele) {
		ele.click();
	}
	
	public void selectValueUsingIndex(WebElement ele, int index ) {
		new Select(ele).selectByIndex(index);
	}
	

}
















