package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
WebDriver driver;
public LogInPage(WebDriver driver) {
	this.driver=driver;
}

@FindBy(how=How.XPATH,using="//input[@id=\"username\"]") WebElement Username_element;
@FindBy(how=How.XPATH,using = "//input[@id=\"password\"]") WebElement Password_element;
@FindBy(how=How.XPATH,using = "//button[@name=\"login\"]") WebElement Sign_Button_elment;

public void login(String username, String password) {
	
	 Username_element.sendKeys(username);
	 Password_element.sendKeys(password);
	 Sign_Button_elment.click();
}
}
