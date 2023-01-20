package cucumberAutomationExercisePage;

import org.openqa.selenium.support.PageFactory;

import cucumberAutomationExercisePageLocators.DeleteAccountPageLocators;

public class DeleteAccountPage extends BasePage{
	DeleteAccountPageLocators deleteAccountPageLocators;
	
	public DeleteAccountPage() {
		deleteAccountPageLocators=new DeleteAccountPageLocators();
		PageFactory.initElements(driver, deleteAccountPageLocators);
	}
	
	public boolean accountDeletedIsDisplayed() {
		return isDisplayed(deleteAccountPageLocators.accountDeleted);
	}
	
	public HomePage clickOnContinueButton() {
		deleteAccountPageLocators.continueButton.click();
		return new HomePage();
	}
	
	

}
