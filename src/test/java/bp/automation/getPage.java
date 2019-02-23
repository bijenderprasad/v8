package bp.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

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
	
	
	public void hiturl(String url) {
		driver.get(url);
		System.out.println("URL Launchecd : " + url);
	}

	public String displayWebElementName(By token) {
		return driver.findElement(token).getText();
	}

	public void click(By token) {
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
	
}
