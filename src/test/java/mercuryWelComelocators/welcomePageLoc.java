package mercuryWelComelocators;

import org.openqa.selenium.By;

public class welcomePageLoc {

	public By register = By.xpath("//a[contains(text(),'REGISTER')]");
	public By usernameField=By.xpath("//input[@name='userName']");
	public By passwordField=By.xpath("//input[@name='password']");
	public By loginbutton=By.xpath("//input[@name='login']");
	public By alloptions = By.xpath("(//tr[@class='mouseOut'])");
	
}
