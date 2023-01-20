package cucumberAutomationExercisePageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class SignupLoginPageLocators {
	
	@CacheLookup
	@FindBy(xpath="//h2[contains(text(),'New User Signup!')]")
	public WebElement newUserSignup;
	@CacheLookup
	@FindBy(xpath="//input[@type='text']")
	public WebElement nameInput;
	@CacheLookup
	@FindBy(xpath="//form[@action='/signup']//input[@type='email']")
	public WebElement emailInput;
	@CacheLookup
	@FindBy(xpath="//button[contains(text(),'Signup')]")
	public WebElement signupButton;
	

}
