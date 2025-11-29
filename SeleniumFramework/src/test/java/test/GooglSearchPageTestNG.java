package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.GoogleSearchPageObjects;

public class GooglSearchPageTestNG {
	
	private static WebDriver driver =null;
	
	@BeforeTest
	public void setUpTest() {
		driver = new FirefoxDriver();
		System.out.println("A");
	}
	
	@Test
	public static void googleSearchTest() throws InterruptedException {
	GoogleSearchPageObjects searchPageObj= new GoogleSearchPageObjects(driver);
	driver.get("https://google.com");
	searchPageObj.setTextInSearchBox("ABCD");
	Thread.sleep(2000);
	searchPageObj.clickSearchButton();
	
	}

	@AfterTest
	public void tearDownTest() {
		driver.close();
		System.out.println("Test Completed Successfully");
		
	}
	
}
