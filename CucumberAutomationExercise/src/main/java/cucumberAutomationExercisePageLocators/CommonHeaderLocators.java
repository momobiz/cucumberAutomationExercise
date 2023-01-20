package cucumberAutomationExercisePageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CommonHeaderLocators {
	
	@CacheLookup
	@FindBy(xpath="//a[contains(text(),'Home')]")
	public WebElement home;
	@CacheLookup
	@FindBy(xpath="//a[contains(text(),'Signup / Login')]")
	public WebElement signupLoginButton;
	

}
