package MaerskTest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.junit.*;




import org.openqa.selenium.WebDriver;

import MaerskTest.pages.BookingConfirmationFinalPage;
import MaerskTest.pages.FlightsPage;
import MaerskTest.pages.HomePage;
import MaerskTest.pages.PurchaseFlightPage;

public class BookingConfirmation {

 
	static WebDriver driver;
	static HomePage home;
	static FlightsPage flightpage;
	static PurchaseFlightPage purchaseflightpage;
	static BookingConfirmationFinalPage bookingconfirmationfinalpage;
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe" );
	driver = new ChromeDriver();
	driver.get("https://blazedemo.com/");
	Thread.sleep(5000);
	
	HomePage home = PageFactory.initElements(driver, HomePage.class);
	PurchaseFlightPage purchaseflightpage = PageFactory.initElements(driver,PurchaseFlightPage.class);
	FlightsPage flightspage = PageFactory.initElements(driver,FlightsPage.class);
	BookingConfirmationFinalPage bookingconfirmationfinalpage = PageFactory.initElements(driver,BookingConfirmationFinalPage.class);
	
	
	home.selectdepcity();
	home.selectdescity();
	home.clickOnFlightButton();
	flightspage.clickchooseFlights();
	purchaseflightpage.enterDetails();
	String pageHeader = bookingconfirmationfinalpage.getPageHeader();
	//System.out.println(pageHeader);;
	
	if (pageHeader.equals("Thank you for your purchase today!"))
	{
		System.out.print("Test case is passed");
		
	}
	else
	
		System.out.print("Test case is failed");
	}
	
	
	
	
	}


