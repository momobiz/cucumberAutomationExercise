package cucumberAutomationExercisePage;

import java.util.logging.Level;

import org.checkerframework.checker.signature.qual.SignatureUnknown;
import org.openqa.selenium.support.PageFactory;

import cucumberAutomationExercisePageLocators.CommonHeaderLocators;
import cucumberAutomationExercisePageLocators.LogoutDeleteAccountHeaderLocators;
import cucumberAutomationExercisePageLocators.SignupLoginHeaderLocators;

public class Header extends BasePage{
	CommonHeaderLocators commonHeaderLocators;
	SignupLoginHeaderLocators signupLoginHeaderLocators;
	LogoutDeleteAccountHeaderLocators  logoutDeleteAccountHeaderLocators;
	
	//constructor to generate a specific header for HomePage
	public Header() {
		commonHeaderLocators=new CommonHeaderLocators();
		signupLoginHeaderLocators=new SignupLoginHeaderLocators();
		logoutDeleteAccountHeaderLocators=null;
		PageFactory.initElements(driver, commonHeaderLocators);
		PageFactory.initElements(driver, signupLoginHeaderLocators);
	
			
		}
	//constructor to generate a specific header for userPage
	public Header(String userPage) {
		try {
			if(userPage.contentEquals("userPage")) {
				commonHeaderLocators=new CommonHeaderLocators();
				logoutDeleteAccountHeaderLocators=new LogoutDeleteAccountHeaderLocators();
				signupLoginHeaderLocators=null;
				PageFactory.initElements(driver, commonHeaderLocators);
				PageFactory.initElements(driver,logoutDeleteAccountHeaderLocators);
				logger.log(Level.INFO, "An Instance of header "+userPage+" is created" );
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public boolean homeIsDisplayed() {
		return isDisplayed(commonHeaderLocators.home);
	}
	
	public SignupLoginPage clickOnLoginSignupButton() {
		commonHeaderLocators.signupLoginButton.click();
		return new SignupLoginPage();
	}

	
	
		
	
		
	

}
