package test;
import java.awt.Window;
import java.awt.event.WindowStateListener;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.util.concurrent.FluentFuture;

import pages.googlesearchpage;

public class Testgooglesearch {

	public static void main(String[] args) throws InterruptedException {
		googlesearch();		
	}	
	public static void googlesearch() throws InterruptedException
	{		
		WebDriver driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver .get("http://www.google.co");
		googlesearchpage.googlesearch_text_box(driver).sendKeys("Automation");
		Thread.sleep(2000);
		googlesearchpage.googlesearchenter(driver).sendKeys(Keys.ENTER);
		driver.close();
		//System.out.println("Test Completed");
		
		// dynamic synchronisation > explicit wait
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 * wait.until(ExpectedConditions.titleContains("download")); 
		 * FluentWait wait1 = new FluentWait(driver); 
		 * wait1.withTimeout(Duration.ofSeconds(10));
		 * wait1.pollingEvery(Duration.ofSeconds(10));
		 * wait1.ignoring(NoSuchElementException.class);
		 * wait1.until(ExpectedConditions.alertIsPresent());
		 */
		/*   Scoll web page
		 * // JavascriptExecutor jse = (JavascriptExecutor) driver;
		 * jse.executeScript("window.scrollBy(0,500)");
		 */
		
		
		
		
	}
}