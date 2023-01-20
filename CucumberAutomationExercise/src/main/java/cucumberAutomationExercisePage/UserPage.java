package cucumberAutomationExercisePage;

import org.openqa.selenium.support.PageFactory;

import cucumberAutomationExercisePageLocators.UserPageLocators;

public class UserPage extends BasePage{
	UserPageLocators userPageLocators;
    Header header;
	public UserPage() {
		userPageLocators=new UserPageLocators();
		PageFactory.initElements(driver, userPageLocators);
		header=new Header("userPage");
	}

	public String getLoggedAs() {
		return header.logoutDeleteAccountHeaderLocators.loggedAs.getText();
	}
	
	public DeleteAccountPage clickOnDeleteAccountButton() {
		header.logoutDeleteAccountHeaderLocators.deleteAccountButton.click();
		return new DeleteAccountPage();
		}

}
