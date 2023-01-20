package cucumberAutomationExerciseSteps;

import org.testng.asserts.SoftAssert;

import cucumberAutomationExercisePage.AccountCreatedPage;
import cucumberAutomationExercisePage.DeleteAccountPage;
import cucumberAutomationExercisePage.EnterAccountInformationPage;
import cucumberAutomationExercisePage.HomePage;
import cucumberAutomationExercisePage.SignupLoginPage;
import cucumberAutomationExercisePage.UserPage;

public abstract class BaseSteps {
	
	SoftAssert softAssert;
	static HomePage homePage;
	static SignupLoginPage signupLoginPage;
	static EnterAccountInformationPage enterAccountInformationPage;
	static AccountCreatedPage accountCreatedPage;
	static UserPage userPage;
	static DeleteAccountPage deleteAccountPage;
	
	
	public BaseSteps() {
		softAssert=new SoftAssert();
	}
	

}
