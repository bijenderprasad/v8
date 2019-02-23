package bp.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import mercuryWelcomeActionClass.homePageActionClass;
import mercuryWelcomeActionClass.registerPageActionClass;

public class testSession {

	public static WebDriver driver;
	public homePageActionClass homePageActionClass;
	public registerPageActionClass registerPageActionClass;

	public WebDriver getdriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\selenium Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}

	public testSession() {
		getdriver();
		init();
	}

	public void init() {
		homePageActionClass = new homePageActionClass(driver);
		registerPageActionClass = new registerPageActionClass(driver);
	}
}
