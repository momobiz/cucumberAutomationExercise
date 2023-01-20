package cucumberAutomationExerciseSteps;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import cucumberAutomationExercisePage.BasePage;
import cucumberAutomationExercisePage.HomePage;
import cucumberAutomationExerciseUtility.BirthDate;
import cucumberAutomationExerciseUtility.ConvertNumberFromSheet;
import cucumberAutomationExerciseUtility.ReadExcelSheet;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserRegisterSteps extends BaseSteps {

	public UserRegisterSteps() {
		super();
	}

	@Given("user launchs {string} browser")
	public void user_launchs_browser(String browserName) {
		BasePage.launchBrowser(browserName);
	}

	@When("user opens the homePage")
	public void user_opens_the_homePage() {
		homePage = new HomePage();

	}

	@Then("Verify that home page is visible successfully")
	public void verify_that_home_page_is_visible_successfully() {
		softAssert.assertTrue(homePage.header.homeIsDisplayed());

	}

	@When("user clicks on Signup\\/Login button")
	public void user_clicks_on_Signup_Login_button() {
		signupLoginPage = homePage.header.clickOnLoginSignupButton();

	}

	@Then("Verify New User Signup! is visible")
	public void verify_New_User_Signup_is_visible() {
		softAssert.assertTrue(signupLoginPage.newUserSignupIsDisplayed());
	}

	@When("user enters his name and email from {string} through {int}")
	public void user_enters_his_name_and_email_from_through(String sheetName, Integer rowNumber) {
		try {

			signupLoginPage.fillSignupName(ReadExcelSheet.readData(sheetName, rowNumber).get("name"));
			signupLoginPage.fillSignupEmail(ReadExcelSheet.readData(sheetName, rowNumber).get("email"));
			
			
		} catch (InvalidFormatException | IOException e) {

			e.printStackTrace();
		}

	}

	@When("use clicks Signup button")
	public void use_clicks_Signup_button() {
		enterAccountInformationPage=signupLoginPage.clickOnSignupButton();

	}

	@Then("Verify that ENTER ACCOUNT INFORMATION is visible")
	public void verify_that_ENTER_ACCOUNT_INFORMATION_is_visible() {
		softAssert.assertTrue(enterAccountInformationPage.enterAccountInformationIsDisplayed());

	}
	@When("user fills details: Title, Name...from {string} through {int}")
	public void user_fills_details_Title_Name_from_through(String sheet, Integer rowNumber) {
	    try {
			
	    	enterAccountInformationPage.selectTitle(ReadExcelSheet.readData(sheet, rowNumber).get("Title"));
	    	enterAccountInformationPage.fillInName(ReadExcelSheet.readData(sheet, rowNumber).get("Name"));
	    	enterAccountInformationPage.fillInPassword(ReadExcelSheet.readData(sheet, rowNumber).get("Password"));
	    	
	       BirthDate date=new BirthDate(ReadExcelSheet.readData(sheet, rowNumber).get("DateOfBirth"));
	       enterAccountInformationPage.selectDayOfBirth(date.generateDayOfBirth());
	       enterAccountInformationPage.selectMonthOfBirth(date.generateMonthOfBrith());
	       enterAccountInformationPage.selectYearOfBirth(date.generateYearOfBirth());

	    	
		} catch (InvalidFormatException | IOException e) {
			
			e.printStackTrace();
		}
	}
	@And("user selects checkbox of newsletter! {string} through {int}")
	public void user_selects_checkbox_of_newsletter_through(String sheet, Integer rowNumber) {
		try {
			Boolean userRequest=Boolean.parseBoolean(ReadExcelSheet.readData(sheet, rowNumber).get("Newsletters"));
			enterAccountInformationPage.selectNewsletterCheckbox(userRequest);
			
		} catch (InvalidFormatException | IOException e) {
			
			e.printStackTrace();
		}
	   
	}

	@And("user selects checkbox to receive or not special offers from our partners! {string} through {int}")
	public void user_selects_checkbox_to_receive_or_not_special_offers_from_our_partners_through(String sheet, Integer rowNumber) {
               
		try {
			Boolean userRequest = Boolean.parseBoolean(ReadExcelSheet.readData(sheet, rowNumber).get("offersFromPartners"));
			enterAccountInformationPage.selectOffersFromClientsCheckbox(userRequest);
		} catch (InvalidFormatException | IOException e) {
		
			e.printStackTrace();
		}
		
		
	}
	@And("user  Fills the rest of details like Firstname, Lastname...from {string} through {int}")
	public void user_Fills_the_rest_of_details_like_Firstname_Lastname_from_through(String sheet, Integer rowNumber) {
	   try {
		   
		enterAccountInformationPage.fillInFirstname(ReadExcelSheet.readData(sheet, rowNumber).get("Firstname"));
		enterAccountInformationPage.fillInLastname(ReadExcelSheet.readData(sheet, rowNumber).get("Lastname"));
		enterAccountInformationPage.fillInCompany(ReadExcelSheet.readData(sheet, rowNumber).get("Company"));
		enterAccountInformationPage.fillInAddress(ReadExcelSheet.readData(sheet, rowNumber).get("Address"));
		enterAccountInformationPage.fillInAddress2(ReadExcelSheet.readData(sheet, rowNumber).get("Address2"));
		enterAccountInformationPage.selectCountry(ReadExcelSheet.readData(sheet, rowNumber).get("Country"));
		enterAccountInformationPage.fillInState(ReadExcelSheet.readData(sheet, rowNumber).get("State"));
		enterAccountInformationPage.fillInCity(ReadExcelSheet.readData(sheet, rowNumber).get("City"));
		enterAccountInformationPage.fillInZipcode(ConvertNumberFromSheet.convert(ReadExcelSheet.readData(sheet, rowNumber).get("ZipCode")));
		enterAccountInformationPage.fillInMobilenumber(ConvertNumberFromSheet.convert(ReadExcelSheet.readData(sheet, rowNumber).get("MobileNumber")));
		
	} catch (InvalidFormatException | IOException e) {
		
		e.printStackTrace();
	}
	}
	@And("user clicks on Create Account button")
	public void user_clicks_on_Create_Account_button() {
	    accountCreatedPage=enterAccountInformationPage.clickOnCreateAccountButton();
	    
	}

	@And("Verify that ACCOUNT CREATED! is visible")
	public void verify_that_ACCOUNT_CREATED_is_visible() {
		softAssert.assertTrue(accountCreatedPage.accountCreatedIsDisplayed());
	   
	}
	@When("user clicks on Continue button")
	public void user_clicks_on_Continue_button() {
		userPage=accountCreatedPage.clickOnContinueButton();
	   
	}
	@Then("Verify that Logged in as username is visible {string} through {int}")
	public void verify_that_Logged_in_as_username_is_visible_through(String sheet, Integer rowNumber) {
	   
	   try {
		String username=ReadExcelSheet.readData(sheet, rowNumber).get("name");
		softAssert.assertEquals("Logged in as "+username,userPage.getLoggedAs());
		
		
	} catch (InvalidFormatException | IOException e) {
		
		e.printStackTrace();
	}
	   
	}
	@When("user clicks on Delete Account button")
	public void user_clicks_on_Delete_Account_button() {
	    deleteAccountPage=userPage.clickOnDeleteAccountButton();
	}
	
	@Then("Verify that ACCOUNT DELETED! is visible")
	public void verify_that_ACCOUNT_DELETED_is_visible() {
	    softAssert.assertTrue(deleteAccountPage.accountDeletedIsDisplayed());
	}
	@And("user clicks on Continue button to confirm the delete of account")
	public void user_clicks_on_Continue_button_to_confirm_the_delete_of_account() {
	    deleteAccountPage.clickOnContinueButton();
	}

}
