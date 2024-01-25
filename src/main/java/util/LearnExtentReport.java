package util;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtentReport {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub 
		
		//setup the physical path for report
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./Reports/result.html");
		
		reporter.setAppendExisting(true);
		
		//create object for extentReports
		ExtentReports extent=new ExtentReports();
		
		//attach data with physical path
		extent.attachReporter(reporter);
		
		//create a test case and assign
		
				ExtentTest test = extent.createTest("Login", "Login test for LeafTap application");
		test.assignCategory("smoke");
		
		test.assignAuthor("Usha");
		// Step level status
		
		test.pass("Enter username");// if status pass, the test will treated as pass
		test.pass("Enter password");// the status is fail
		
		
		// attach the screenshot // ../ control still stay in report folder to come out
		
		// of it
		test.pass("click login button", MediaEntityBuilder.createScreenCaptureFromPath(".././snap/LoginPage.png").build());
		
		
		//Mandatory step
		extent.flush();
		

		

	}

}
