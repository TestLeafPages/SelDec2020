package utils;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.model.Media;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reports {

	public ExtentSparkReporter spark;
	public ExtentReports extent;
	public ExtentTest test;
	public String testName, testDes, author, category, device;

	@BeforeSuite
	public void startReport() {
		spark = new ExtentSparkReporter("./sparkReports/resutl.html");
		extent = new ExtentReports();
		extent.attachReporter(spark);
	}

	@BeforeClass
	public void testCaseInfo() {
		test = extent.createTest(testName, testDes);
		test.assignAuthor(author);
		test.assignCategory(category);
		test.assignDevice(device);
	}

	public void reportStep(String desc, String status) {
		
		Media img = MediaEntityBuilder.createScreenCaptureFromPath("./1.png").build();
		if(status.equalsIgnoreCase("pass")) {
			test.pass(desc, img);
		}else if(status.equalsIgnoreCase("fail")) {
			test.fail(desc, img);
		}
	}
 
	@AfterSuite
	public void stopReport() {
		extent.flush();
	}

}
