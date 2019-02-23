package mercuryTestClassess;

import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import bp.automation.testSession;
import mercuryWelComelocators.welcomePageLoc;

public class verify_user_can_book_flight {

	testSession test;
	welcomePageLoc welcomePageLoc = new welcomePageLoc();
	By xpathusername = welcomePageLoc.usernameField;
	By xpathpassword = welcomePageLoc.passwordField;
	By loginButton = welcomePageLoc.loginbutton;
	

	verify_user_can_book_flight() {
		test = new testSession();
	}

	@BeforeMethod
	public void handleTestMethodName(Method method) {
		test.homePageActionClass.stepStartMessage(method.getName());
	}

	@AfterMethod
	public void setupAfterTestMethod() {
		test.homePageActionClass.aftermethodsetup();
	}

	@Test
	public void navigatetohomepage() {

		test.homePageActionClass.launchurl("http://newtours.demoaut.com/mercurywelcome.php");
	}
	@Test  (dependsOnMethods = "navigatetohomepage")
	public void login() {
		test.homePageActionClass.login(xpathusername, "bijepras", xpathpassword, "26265547bp");
		test.homePageActionClass.clickOnSignInButton(loginButton);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
