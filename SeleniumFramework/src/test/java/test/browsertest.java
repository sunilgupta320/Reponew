package test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class browsertest {

	public static void main(String[] args) {
		//https://chromedriver.storage.googleapis.com/index.html?
		//String projectpath=System.getProperty("user.dir");
		//System.setProperty("webdriver.chrome.driver",projectpath+"/Drivers/chromedriver/chromedriver.exe" );
		//WebDriver driver=new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver","D:\\Eclipse Workspace\\Workspace 15 Mar 2024\\SeleniumFramework\\Drivers\\geckodriver\\geckodriver.exe" );
		
		WebDriver driver=new InternetExplorerDriver();
		driver.get("http://www.google.com");
		String title= driver.getTitle();
		System.out.print(title);
		driver.quit();
	}
} 

