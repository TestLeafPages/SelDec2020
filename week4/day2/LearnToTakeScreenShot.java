package week4.day2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnToTakeScreenShot {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://leafground.com/pages/Window.html");
		
		WebElement openHomePage = driver.findElementById("home");
		
		//method to take screenshot
		//File source = driver.getScreenshotAs(OutputType.FILE);
		
		File source = openHomePage.getScreenshotAs(OutputType.FILE);
		
		//target location
		File target = new File("C:\\Users\\hp\\Desktop\\SelDec2020\\openHomePage.png");
		
		//copy source into target
		FileUtils.copyFile(source, target);
		
		
	}

}
