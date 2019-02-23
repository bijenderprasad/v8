package mercuryWelcomeActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import bp.automation.getPage;

public class homePageActionClass extends getPage{

	
	public homePageActionClass(WebDriver driver) {
		super(driver);
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
	
	
	
}
