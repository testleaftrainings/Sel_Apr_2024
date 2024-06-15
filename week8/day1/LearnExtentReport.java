package week8.day1;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtentReport {
	
	public static void main(String[] args) throws IOException {
		// Common Steps for all the testcases
		// Step 1: Set up the path of reports folder
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./reports/result.html");
		// Step 2: Create object for ExtentReports
		ExtentReports extent = new ExtentReports();
		// Step 3: attach the data with the file
		extent.attachReporter(reporter);
		
		// Step 4: Create testcases and assign test details
		                                  // testName    testDescription
		ExtentTest test = extent.createTest("CreateLead","CreateLead with multiple data");
		test.assignCategory("regression");
		test.assignAuthor("Subraja");
		
		// Step 5: Step level status
		test.pass("The username is entered successfully",MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/Stringmemory.png").build());
		test.pass("The password is entered successfully");
		test.pass("The Login button is clicked successfully");
		
		// Step 6: Mandatory 
		extent.flush();
		
		System.out.println("Done");
		
		
		
		
	}

}
