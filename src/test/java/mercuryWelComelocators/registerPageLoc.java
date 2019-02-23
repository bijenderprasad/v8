package mercuryWelComelocators;

import org.openqa.selenium.By;

public class registerPageLoc {

	
	public By firstname = By.xpath("//input[@name='firstName']");
	public By lastname = By.xpath("//input[@name='lastName']");
	public By phonne = By.xpath("//input[@name='phone']");
	public By email = By.xpath("//input[@id='userName']");
	public By address1 = By.xpath("//input[@name='address1']");
	public By city = By.xpath("//input[@name='city']");
	public By state = By.xpath("//input[@name='state']");
	public By pincode = By.xpath("//input[@name='postalCode']");

	public By countrydropdown = By.xpath("//select[@name='country']");
	public By username = By.xpath("//input[@id='email']");
	public By password = By.xpath("//input[@name='password']");
	public By confirmPassword = By.xpath("//input[@name='confirmPassword']");
	public By submit = By.xpath("//input[@name='register']");
	public By registerlogo = By.xpath("//img[@src='/images/masts/mast_register.gif']");
	public By register = By.xpath("//a[contains(text(),'REGISTER')]");
	
	
	////////////////////////////////////////////////////////////////////////////////////
	// Registration Page confirmation 
	public By registerheading = By.xpath("//img[@src='/images/masts/mast_register.gif']");
	public By actualName = By.xpath("//b[contains(text(),'Note: Your user name')]");
	public By footer = By.xpath("//div[@class='footer']");
	public By signIn = By.xpath("//a[contains(text(),'sign-in')]");
	
	

}
