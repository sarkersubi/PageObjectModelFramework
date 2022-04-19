package session6POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LogInPage;
import util.BrowserFactory;

@Test
public class LogInTest {
	WebDriver driver;

	public void validUserShouldBeLogIn() {
		WebDriver driver = BrowserFactory.inIt();

		LogInPage loginpage = PageFactory.initElements(driver, LogInPage.class);
		loginpage.login("demo@techfios.com", "abc123");
		
		DashboardPage dashboardpage=PageFactory.initElements(driver, DashboardPage.class);
		dashboardpage.verifyDeshboardPage();
		dashboardpage.CustomerButton();

		// BrowserFactory.tearDown();

	}
}