package MaerskTest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookingConfirmationFinalPage {
final WebDriver driver;
	
	public BookingConfirmationFinalPage(WebDriver driver)
	{
		this.driver = driver;
			
	}
	
	@FindBy(xpath = ("//h1"))
	WebElement finalPageHeader;
	
	public String getPageHeader() {
		String value;
		value = finalPageHeader.getText();
		
		return value;
		
	}
	
	

}
