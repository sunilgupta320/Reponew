package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportWithTestNG {
	
	ExtentSparkReporter htmlReporter;
	ExtentReports extent;
	WebDriver driver;

	@BeforeSuite
	public void setUp() {
		 htmlReporter = new ExtentSparkReporter("extentReports1.html");
		 extent = new ExtentReports();
		 extent.attachReporter(htmlReporter);	
		
	}
	@BeforeTest
	public void beforeTest() {
		driver = new FirefoxDriver();
	}
	
	@Test
	public void test1() throws Exception{
		
		ExtentTest test = extent.createTest("Google Search Test1","Validate google search works fine");
		driver.get("https://google.com");
		test.pass("Navigated to Google.com page");		
		test.log(Status.INFO, "starting test case");
		test.info("this step shows usage of info (details)");
		test.fail("details",MediaEntityBuilder.createScreenCaptureFromPath("extent.png").build());
		test.addScreenCaptureFromPath("extent.png");

	}
	
	@Test
	public void test2() throws Exception{
		ExtentTest test = extent.createTest("Google Search Test2","Validate google search works fine");
		test.pass("Navigated to Google.com page");		
		test.log(Status.INFO, "starting test case");
		test.info("this step shows usage of info (details)");
		test.pass(MediaEntityBuilder.createScreenCaptureFromPath("extent.png").build());
		test.addScreenCaptureFromPath("extent.png");

	}

	@AfterTest
	public void tearDownTest() {
		//driver.close();
		driver.quit();
		System.out.println("Test Completed successfully");
	}
	
	@AfterSuite
	public void tearDown() {
		extent.flush();

	}
	




}
