package week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		  driver.get("http://leafground.com/pages/Window.html");
		  
		  driver.findElementByXPath("//button[text()='Open Home Page']").click();
		  
		  String title = driver.getTitle();
		  
		  System.out.println(title);
		  //to get the reference of the current window
		  String firstWin = driver.getWindowHandle();
		  System.out.println(firstWin);
		  
		  System.out.println("***********************************");
		  
		  Set<String> windowHandles = driver.getWindowHandles();
		  
		  //copy the data from set to list
		  List<String> listHandles = new ArrayList<String>(windowHandles);
		  
		  // to get single data from list
		  String secondWin = listHandles.get(1);
		  
		  //to move the control from 1st window to the 2nd window
		  driver.switchTo().window(secondWin);
		  
		  String title2 = driver.getTitle();
		  
		  System.out.println(title2);
		  
		  
		  //to close the current window
		  driver.close();
		  
		  //to close all the windows
		 // driver.quit();
		  
		/*
		 * for (String eachWinHandle : windowHandles) {
		 * System.out.println(eachWinHandle);
		 * 
		 * }
		 */
		  
		  driver.switchTo().window(firstWin);
		  
		  String title3 = driver.getTitle();
		  
		  System.out.println(title3);
		 

	}

}
