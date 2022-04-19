package session6POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashboardPage;
import page.LogInPage;
import util.BrowserFactory;

public class AddCustomerTest {


WebDriver driver;
@Test
public void userShouldAbleToCreatCustomer() {
	driver=BrowserFactory.inIt();
	LogInPage login=PageFactory.initElements(driver, LogInPage.class);
	login.login("demo@techfios.com", "abc123");
	
	DashboardPage dashboard= PageFactory.initElements(driver,	DashboardPage.class );
	dashboard.verifyDeshboardPage();
	dashboard.CustomerButton();
	
	AddCustomerPage addcustomerpage=PageFactory.initElements(driver, AddCustomerPage.class);
	addcustomerpage.insertFullName();
	addcustomerpage.selectCompanyDropDown("ATT");
	addcustomerpage.insertElemnts();
	addcustomerpage.selectcountryDropDown("Albania");
	
	addcustomerpage.clicksaveButton();
	
	
	
	
	
	
}


}
