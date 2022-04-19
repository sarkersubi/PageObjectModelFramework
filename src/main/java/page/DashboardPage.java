package page;


import org.openqa.selenium.WebDriver;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DashboardPage {
	WebDriver driver;
	public DashboardPage(WebDriver driver) {
	this.driver=driver;	
	}

@FindBy(how=How.XPATH,using= "//h2[contains(text(),' Dashboard ')]")WebElement Dashboard_header_element;
@FindBy(how=How.XPATH, using = "//span[contains(text(),\"Customers\")]")WebElement Customer_element;
@FindBy(how=How.XPATH, using = "//a[contains(text(),\"Add Customer\")]")WebElement Add_Customer_element;

public void verifyDeshboardPage() {
	Assert.assertEquals( Dashboard_header_element.getText(), "Dashboard", "Wrong page");
}
public void CustomerButton() {
	Customer_element.click();
	 Add_Customer_element.click();
}

}
