package learnReports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class LearnReportsV5 {
	
	public static void main(String[] args) {
		
		// File Level
		ExtentSparkReporter spark = new ExtentSparkReporter("./sparkReports/resutl.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(spark);
		
		// TestCase Level - CreateLead
		ExtentTest test = extent.createTest("TC001CreateLead", "Create a New Lead in leaf taps Module");
		test.assignAuthor("Gopinath Jayakumar");
		test.assignCategory("Smoke");
		test.assignDevice("Mac Pro");
		
		// Step level - enter username
		// status for step level - Pass, Fail, Warning, info and skip
		test.pass("The Data DemoSalesManager entered Successfully", 
				MediaEntityBuilder.createScreenCaptureFromPath("./1.png").build());
		test.pass("The Data crmsfa entered Successfully",
				MediaEntityBuilder.createScreenCaptureFromPath("./2.png").build());
		test.fail("The Element Login button could not click",
				MediaEntityBuilder.createScreenCaptureFromPath("./3.png").build());
		
		// Write the logic 
		extent.flush();
		
	}

}
