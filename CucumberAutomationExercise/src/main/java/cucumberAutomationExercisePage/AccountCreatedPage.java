package cucumberAutomationExercisePage;

import org.openqa.selenium.support.PageFactory;

import cucumberAutomationExercisePageLocators.AccountCreatedPageLocators;

public class AccountCreatedPage extends BasePage{
	AccountCreatedPageLocators accountCreatedPageLocators;
	
	public AccountCreatedPage() {
		accountCreatedPageLocators=new AccountCreatedPageLocators();
		PageFactory.initElements(driver, accountCreatedPageLocators);
	}
	
	public boolean accountCreatedIsDisplayed() {
		return isDisplayed(accountCreatedPageLocators.accountCreated);
	}
	
	public UserPage clickOnContinueButton() {
		accountCreatedPageLocators.continueButton.click();
		return new UserPage();
	}
	
}
