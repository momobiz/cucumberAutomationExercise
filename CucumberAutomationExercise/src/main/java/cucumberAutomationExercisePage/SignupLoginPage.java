package cucumberAutomationExercisePage;

import org.openqa.selenium.support.PageFactory;

import cucumberAutomationExercisePageLocators.SignupLoginPageLocators;

public class SignupLoginPage extends BasePage{
	SignupLoginPageLocators signupLoginPageLocators;
	
	public SignupLoginPage(){
		signupLoginPageLocators=new SignupLoginPageLocators();
		PageFactory.initElements(driver, signupLoginPageLocators);
	}
	
	public boolean newUserSignupIsDisplayed() {
		return isDisplayed(signupLoginPageLocators.newUserSignup);
	}
	
	public void fillSignupName(String name) {
		fillInput(signupLoginPageLocators.nameInput, name);
	}
	public void fillSignupEmail(String email) {
		fillInput(signupLoginPageLocators.emailInput, email);
	}
	public EnterAccountInformationPage clickOnSignupButton() {
		signupLoginPageLocators.signupButton.click();
		return new EnterAccountInformationPage();
	}
	
	
}
