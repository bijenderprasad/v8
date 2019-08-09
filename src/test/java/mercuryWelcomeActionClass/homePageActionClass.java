package mercuryWelcomeActionClass;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import bp.automation.getPage;

public class homePageActionClass extends getPage{
	WebDriver driver;
	
	public homePageActionClass(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}



	public void launchurl(String url) {
		hiturl(url);
		
		
	}
	
	public void clickonRegisterbutton(By register) {
	click(register);	
	}
	
	public void login(By token1 ,String username, By token2,String password) {
		filltext(token1, username, token2, password );
		}
	public void clickOnSignInButton(By signin) {
		click(signin);
	}
	
	public void getAllValues(By token) {
		getTexts(token);
		if (returntexts(token).contains("Homes")) {
			System.out.println("String found");
		}
		else
			System.out.println("String not found");
		
	}
	
	
	
	
}
