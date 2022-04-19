package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class AddCustomerPage extends BasePage {
	WebDriver driver;

	public AddCustomerPage(WebDriver driver) {
		this.driver = driver;
	}		
@FindBy(how=How.XPATH,using="//input[@id=\"account\"]")WebElement Fullname_element;
@FindBy(how=How.XPATH,using="//select[@id=\"cid\"]")WebElement Company_element;
@FindBy(how=How.XPATH,using="//input[@id=\"email\"]")WebElement Email_element;
@FindBy(how=How.XPATH,using="//input[@id=\"phone\"]")WebElement Phone_element;
@FindBy(how=How.XPATH,using="//input[@id=\"address\"]")WebElement Address_element;
@FindBy(how=How.XPATH,using="//input[@id=\"city\"]")WebElement City_element;
@FindBy(how=How.XPATH,using="//input[@id=\"state\"]")WebElement State_element;
@FindBy(how=How.XPATH,using="//input[@id=\"zip\"]")WebElement zip_element;
@FindBy(how=How.XPATH,using="//select[@id=\"country\"]")WebElement country_element;
@FindBy(how=How.XPATH,using="//button[@id=\"submit\"]")WebElement save_element;

		
	public void insertFullName() {
		Fullname_element.sendKeys("Palash");
		
	}	

	public void selectCompanyDropDown(String Company) {
		selectFromDropDown(Company_element, Company);
	}
	public void insertElemnts() {
		Email_element.sendKeys("abc@gmail.com");
		Phone_element.sendKeys("32456789");
		Address_element.sendKeys("Street");
		 City_element.sendKeys("Queens");
		 State_element.sendKeys("New York");
		 zip_element.sendKeys("32167");
	}
public void selectcountryDropDown(String country) {
selectFromDropDown(country_element, country);
}
	public void clicksaveButton() {
		save_element.click();
	}

}

