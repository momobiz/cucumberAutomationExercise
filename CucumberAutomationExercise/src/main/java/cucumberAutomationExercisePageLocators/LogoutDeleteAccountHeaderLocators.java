package cucumberAutomationExercisePageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LogoutDeleteAccountHeaderLocators {
	
	@CacheLookup
	@FindBy(xpath="//a[contains(text(),'Logged in as')]")
	public WebElement loggedAs;
	
	@CacheLookup
	@FindBy(xpath="//a[contains(text(),'Delete Account')]")
	public WebElement deleteAccountButton;
	
	

}
