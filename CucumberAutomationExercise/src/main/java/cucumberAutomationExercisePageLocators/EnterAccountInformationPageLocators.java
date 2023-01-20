package cucumberAutomationExercisePageLocators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class EnterAccountInformationPageLocators {
	@CacheLookup
	@FindBy(xpath="//b[contains(text(),'Enter Account Information')]")
	public WebElement enterAccountInformation;
	
	@CacheLookup
	@FindBy(xpath="//input[@name='title']")
	public List<WebElement> titleRadioButtons;
	
	@CacheLookup
	@FindBy(css="#name")
	public WebElement nameInput;
	
	@CacheLookup
	@FindBy(css="#password")
	public WebElement passwordInput;
	
	@CacheLookup
	@FindBy(css="#days")
	public WebElement dayOfBirthDropdown;
	
	@CacheLookup
	@FindBy(css="#months")
	public WebElement monthOfBirthDropdown;
	
	@CacheLookup
	@FindBy(css="#years")
	public WebElement yearOfBirthDropdown;
	

	@CacheLookup
	@FindBy(css="#newsletter")
	public WebElement newslettersCheckbox;
	
	@CacheLookup
	@FindBy(css="#optin")
	public WebElement offersFromPartners;
	
	@CacheLookup
	@FindBy(css="#first_name")
	public WebElement firstNameInput;
	
	@CacheLookup
	@FindBy(css="#last_name")
	public WebElement lastNameInput;

	@CacheLookup
	@FindBy(css="#company")
	public WebElement companyInput;
	
	@CacheLookup
	@FindBy(css="#address1")
	public WebElement addressInput;
	
	@CacheLookup
	@FindBy(css="#address2")
	public WebElement address2Input;
	
	@CacheLookup
	@FindBy(css="#country")
	public WebElement countryDropdown;
	
	@CacheLookup
	@FindBy(css="#state")
	public WebElement stateInput;
	
	@CacheLookup
	@FindBy(css="#city")
	public WebElement cityInput;
	
	@CacheLookup
	@FindBy(css="#zipcode")
	public WebElement zipcodeInput;
	
	@CacheLookup
	@FindBy(css="#mobile_number")
	public WebElement mobilenumberInput;
	
	@CacheLookup
	@FindBy(xpath="//button[contains(text(),'Create Account')]")
	public WebElement createAccountButton;
	
	
	
}
