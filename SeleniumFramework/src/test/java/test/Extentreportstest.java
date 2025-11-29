package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import pages.googlesearchpage;

public class Extentreportstest {

	static WebDriver driver=null;
	public static void main(String[] args) throws InterruptedException {
		
	ExtentSparkReporter htmlReporter = new ExtentSparkReporter("extentReportsA.html");
	//create ExtentReports and attach reporters
	ExtentReports extent = new ExtentReports();
	extent.attachReporter(htmlReporter);
	ExtentTest test1 = extent.createTest("Google Search Test 1","Validate google search works fine");
	driver = new FirefoxDriver();
	
	test1.log(Status.INFO, "starting test case");
	driver .get("http://www.google.com");
	test1.pass("Navigatged to google.com");
	
	googlesearchpage.googlesearch_text_box(driver).sendKeys("Automation");
	test1.pass("Entered text in searchbox");
	
	Thread.sleep(2000);
	googlesearchpage.googlesearchenter(driver).sendKeys(Keys.ENTER);
	test1.pass("pressed keyboard enter key");
	
	driver.close();
	test1.pass("Closed the browser");
	test1.pass("Test Completed");
	
	
	
	
	
	ExtentTest test2 = extent.createTest("Google Search Test 2","Validate google search works fine");
	driver = new FirefoxDriver();
	
	test2.log(Status.INFO, "starting test case");
	driver .get("http://www.google.com");
	test2.pass("Navigatged to google.com");
	
	googlesearchpage.googlesearch_text_box(driver).sendKeys("Automation");
	test2.pass("Entered text in searchbox");
	
	Thread.sleep(2000);
	test2.warning("warn");
	googlesearchpage.googlesearchenter(driver).sendKeys(Keys.ENTER);
	test2.fail("pressed keyboard enter key");
	
	
	test2.skip("Skipped");
	driver.close();
	test2.pass("Closed the browser");
	test2.pass("Test Completed");
	
	//Calling flush writes everything to the log file
	extent.flush();
	
	}

}
