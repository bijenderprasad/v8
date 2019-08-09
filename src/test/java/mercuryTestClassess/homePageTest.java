package mercuryTestClassess;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import bp.automation.testSession;
import mercuryWelComelocators.registerPageLoc;
import mercuryWelComelocators.welcomePageLoc;

public class homePageTest {

	
	testSession test;
	welcomePageLoc welcomePageLoc = new welcomePageLoc();
	registerPageLoc registerPageLoc = new registerPageLoc();
	By alloption= welcomePageLoc.alloptions;

	
	homePageTest(){
		test = new testSession();
	}
	@Test
	public void navigatetohomepage() {

		test.homePageActionClass.launchurl("http://newtours.demoaut.com/mercurywelcome.php");
		test.homePageActionClass.getAllValues(alloption);
	}
	
	
	@AfterClass
	public void closeSession() {
		test.homePageActionClass.closeBrowserSession();
	}

}
