package cucumberAutomationExercisePage;

import java.util.logging.Level;

import org.openqa.selenium.support.PageFactory;

import cucumberAutomationExercisePageLocators.HomePageLocators;

public class HomePage extends BasePage {
	public Header header;
	HomePageLocators homePageLocators;
	
	public HomePage() {
		openUrl("https://automationexercise.com/");
		header=new Header();
		homePageLocators=new HomePageLocators();
		PageFactory.initElements(driver, homePageLocators);
		logger.log(Level.INFO,"An instance of HomePage is created ");
	}
	

}
