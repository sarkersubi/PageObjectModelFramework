package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrowserFactory {
	static WebDriver driver;
	String browser="chrome";
	static String url="https://www.techfios.com/billing/?ng=admin/";
	
	public static WebDriver inIt() {
		System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	}
	
	public static void tearDown() {
		driver.close();
		
	}
	
}
