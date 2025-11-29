package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.GoogleSearchPageObjects;

public class GooglSearchPageTest {
	
	private static WebDriver driver =null;
	public static void main(String[] args) throws InterruptedException {
		googleSearchTest();
		
	}
	
	public static void googleSearchTest() throws InterruptedException {
		driver = new FirefoxDriver();
	GoogleSearchPageObjects searchPageObj= new GoogleSearchPageObjects(driver);
	driver.get("https://google.com");
	searchPageObj.setTextInSearchBox("ABCD");
	Thread.sleep(2000);
	searchPageObj.clickSearchButton();
	driver.close();
	
		
	}

	
}
