package mercuryTestClassess;
import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import bp.automation.testSession;
import mercuryWelComelocators.registerPageLoc;
import mercuryWelComelocators.welcomePageLoc;

public class registerPageTest {

	testSession test;
	welcomePageLoc welcomePageLoc = new welcomePageLoc();
	registerPageLoc registerPageLoc = new registerPageLoc();
	String countryname="INDIA";
	String ExpectedUserName = "Note: Your user name is bijepras.";	
	By register= welcomePageLoc.register;
	By firstname = registerPageLoc.firstname;
	By lastname = registerPageLoc.lastname;
	By phonne = registerPageLoc.phonne;
	By email= registerPageLoc.email;
	By address1 = registerPageLoc.address1;
	By city = registerPageLoc.city;
	By state= registerPageLoc.state;
	By pincode = registerPageLoc.pincode;
	By countrydropdown = registerPageLoc.countrydropdown;
	By username= registerPageLoc.username;
	By password = registerPageLoc.password;
	By confirmPassword = registerPageLoc.confirmPassword;
	By submit = registerPageLoc.submit;
	By registerheading = registerPageLoc.registerheading;
	By actualusername=registerPageLoc.actualName;
	
		
	registerPageTest(){
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

	@Test (dependsOnMethods = "navigatetohomepage")
	public void navigateToRegisterPage() {
		test.homePageActionClass.clickonRegisterbutton(register);
		
	}
	
	@Test  (dependsOnMethods = "navigateToRegisterPage")
	public void enterfirstname() {
		test.registerPageActionClass.entername(firstname, "Bijender");
	}
	@Test (dependsOnMethods = "enterfirstname")
	public void enterlastname() {
		test.registerPageActionClass.entername(lastname, "Prasad");
	}

	@Test  (dependsOnMethods = "enterlastname")
	public void enterPhoneNumberAndEmail() {
		test.registerPageActionClass.contactDetails(phonne, "8802268861");
		test.registerPageActionClass.contactDetails(email, "biji_pundora@yahoo.com");
	}

	@Test  (dependsOnMethods = "enterPhoneNumberAndEmail")
	public void enterAddress() {
		test.registerPageActionClass.addressDetail(address1, "House No. 420");
		test.registerPageActionClass.addressDetail(city, "New Delhi");
		test.registerPageActionClass.addressDetail(state, "Delhi");
		test.registerPageActionClass.addressDetail(pincode, "110023");
		test.registerPageActionClass.selectcountry(countrydropdown, "INDIA");
	}
	

	@Test  (dependsOnMethods = "enterAddress")
	public void enterLogincredentials() {
		test.registerPageActionClass.setupUserLoginData(username, "bijepras");
		test.registerPageActionClass.setupUserLoginData(password, "26265547bp");
		test.registerPageActionClass.setupUserLoginData(confirmPassword, "26265547bp");
		test.registerPageActionClass.clickOnSubmitButton(submit);
	}
	
	@Test  (dependsOnMethods = "enterLogincredentials")
	public void registerCOnfirmation() {
		
		test.registerPageActionClass.textDisplayedConfirmation(registerheading);
		test.registerPageActionClass.Validateusername(ExpectedUserName, actualusername);
	}

}













