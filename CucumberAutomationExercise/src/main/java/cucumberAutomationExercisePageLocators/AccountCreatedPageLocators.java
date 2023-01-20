package cucumberAutomationExercisePageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AccountCreatedPageLocators {
	
	@CacheLookup
	@FindBy(xpath="//b[contains(text(),'Account Created!')]")
	public WebElement accountCreated;
	
	@CacheLookup
	@FindBy(xpath="//a[@class='btn btn-primary']")
	public WebElement continueButton;
	

}
