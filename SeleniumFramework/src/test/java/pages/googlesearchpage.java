package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class googlesearchpage {
	
	
	WebElement element = null;
	public static WebElement googlesearch_text_box(WebDriver driver)
	{
		WebElement element = driver.findElement(By.name("q"));
		return element;
		
	}

	public static WebElement googlesearchenter(WebDriver driver)
	{
		WebElement element = driver.findElement(By.name("btnK"));
		return element;
		
	}

}
