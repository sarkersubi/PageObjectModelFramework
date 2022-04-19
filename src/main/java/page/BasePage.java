package page;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
	
	public int generateRandom(int boundarunum) {
		Random rnd = new Random();
		int generatenum=rnd.nextInt(boundarunum);
		return boundarunum;
	}
		public void selectFromDropDown(WebElement webelement,String visibletext) {
			Select sel = new Select(webelement);
			sel.selectByVisibleText(visibletext);
	
		
	}
		
	
}
