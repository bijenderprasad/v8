package bp.automation;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class getPage {
	WebDriver driver;

	protected getPage(WebDriver driver) {
		this.driver = driver;
	}


	public void stepStartMessage(String testStepName) {
		System.out.println(("***** STARTING TEST STEP:- " + testStepName.toUpperCase() + " *****"));
	}

	public void aftermethodsetup() {
		System.out.println("***************************************************************************************");
	}
	
	public void closeBrowserSession(int flag) {
		if (flag==1) {
			driver.quit();
		}
		
		else
			Reporter.log(("Please remove 0 from After class"),true);
	}
	
	public void closeBrowserSession() {
		driver.quit();
		}
	
	public WebElement element(String token) {
		return driver.findElement(By.xpath(token));
	}
	
	public void hiturl(String url) {
		driver.get(url);
		Reporter.log("open Browser", true);
		System.out.println("URL Launchecd : " + url);
	}

	public String displayWebElementName(By token) {
		return driver.findElement(token).getText();
	}
	
	public int displayWebElementsSize(By token) {
		return driver.findElements(token).size();
	}	

	public void click(By token) {
		Reporter.log("Clicking on Register buttong", true);
		String tokenTextName = driver.findElement(token).getText();
		System.out.println(tokenTextName);
		//System.out.println("Clicked on : " + tokenTextName + ", xPath = " + token);
		driver.findElement(token).click();
	}

	public void filltext(By token, String value) {
		driver.findElement(token).sendKeys(value);
		System.out.println("Value Entered in : " + value);
	}
	
	public void filltext(By token1, String value1,By token2, String value2) {
		driver.findElement(token1).sendKeys(value1);
		System.out.println("Value Entered in : " + value2);
		driver.findElement(token2).sendKeys(value2);
		System.out.println("Value Entered in : " + value2);
	}

	public void dropdownselection(By countrydropdown, String value) {

		Select sc = new Select(driver.findElement(countrydropdown));
		sc.selectByVisibleText(value);
	}

	public Boolean IsElementDisplayed(By token) {
		String text = driver.findElement(token).getText();
		System.out.println(text + "Is displayed on DOM");
		return driver.findElement(token).isDisplayed();
		}
	
	public String getText(By token) {
		String text= driver.findElement(token).getText();
		return text;
	}
	
	public String getText(By token, String replacement) {
		String text= driver.findElement(token).getText();
		return text;
	}
	
	public void textMessageConfirmation(String expected, String actual ) {
		Assert.assertEquals(actual, expected, "Text is Not Matching");
		System.out.println("UserName is As expetced : "+ expected);
	}
	
	public String trimText(By token) {
		String completetext = driver.findElement(token).getText();
		String requiredText1 = completetext.substring(25);
		String[] requiredtext2 = requiredText1.split(".");
		String requiredtext = requiredtext2[0];
		return requiredtext;
	}
	
	public void getTexts(By token) {
		List<WebElement> gettext = driver.findElements(token);
		for (int i = 0 ; i < gettext.size();i++) {
			System.out.println(gettext.get(i).getText());
		}
	}
		
		public List<String> returntexts(By token) {
			List<WebElement> gettext = driver.findElements(token);		
			List<String> gettexts = new ArrayList<String>();
			for (int i = 0 ; i < gettext.size();i++) {
				gettexts.add(gettext.get(i).getText());
			}
			return gettexts;
	}
	
}
