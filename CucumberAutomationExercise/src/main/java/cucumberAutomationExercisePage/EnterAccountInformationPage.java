package cucumberAutomationExercisePage;

import org.openqa.selenium.support.PageFactory;

import cucumberAutomationExercisePageLocators.EnterAccountInformationPageLocators;

public class EnterAccountInformationPage extends BasePage{
	
	EnterAccountInformationPageLocators  enterAccountInformationPageLocators;
	
	public EnterAccountInformationPage() {
		enterAccountInformationPageLocators=new EnterAccountInformationPageLocators();
		PageFactory.initElements(driver, enterAccountInformationPageLocators);
	}
	
	public boolean enterAccountInformationIsDisplayed() {
		return isDisplayed(enterAccountInformationPageLocators.enterAccountInformation);
	}
	public void selectTitle(String gender) {
	
		selectRadioButton(enterAccountInformationPageLocators.titleRadioButtons, convertToCamelCase(gender));
	}
	public void fillInName(String name) {
		fillInput(enterAccountInformationPageLocators.nameInput, name);
	}
	public void fillInPassword(String password) {
		fillInput(enterAccountInformationPageLocators.passwordInput, password);
	}
	public void selectDayOfBirth(String day) {
		scrollDown(100);
		selectOption(enterAccountInformationPageLocators.dayOfBirthDropdown, day);
	}
	public void selectMonthOfBirth(String month) {
		selectOption(enterAccountInformationPageLocators.monthOfBirthDropdown, month);
		
	}
	public void selectYearOfBirth(String year) {
		selectOption(enterAccountInformationPageLocators.yearOfBirthDropdown, year);
	}
	public void selectNewsletterCheckbox(boolean request) {
		if(request) selectCheckbox(enterAccountInformationPageLocators.newslettersCheckbox);
		else deseclectCheckbox(enterAccountInformationPageLocators.newslettersCheckbox);
	}
	public void selectOffersFromClientsCheckbox(boolean request) {
		scrollDown(100);
		if(request) selectCheckbox(enterAccountInformationPageLocators.offersFromPartners);
		else deseclectCheckbox(enterAccountInformationPageLocators.offersFromPartners);
	}
	
	public void fillInFirstname(String firstname) {
		scrollDown(100);
		fillInput(enterAccountInformationPageLocators.firstNameInput,firstname);
	}
	public void fillInLastname(String lastname) {
		fillInput(enterAccountInformationPageLocators.lastNameInput, lastname);
		
	}
	public void fillInCompany(String company) {
		fillInput(enterAccountInformationPageLocators.companyInput, company);
	}
	public void fillInAddress(String address) {
		fillInput(enterAccountInformationPageLocators.addressInput, address);
	}
	public void fillInAddress2(String address2) {
		fillInput(enterAccountInformationPageLocators.address2Input, address2);
	}
	public void selectCountry(String country) {
		scrollDown(100);
		selectOption(enterAccountInformationPageLocators.countryDropdown, convertToCamelCase(country));
	}
	public void fillInState(String state) {
		fillInput(enterAccountInformationPageLocators.stateInput, state);
	}
	public void fillInCity(String city) {
		fillInput(enterAccountInformationPageLocators.cityInput, city);
	}
	public void fillInZipcode(String zipcode) {
		fillInput(enterAccountInformationPageLocators.zipcodeInput, zipcode);
	}
	public void fillInMobilenumber(String mobilenumber) {
		scrollDown(100);
		fillInput(enterAccountInformationPageLocators.mobilenumberInput, mobilenumber);
	}
	public AccountCreatedPage clickOnCreateAccountButton() {
		enterAccountInformationPageLocators.createAccountButton.click();
		return new AccountCreatedPage();
	}
	
	

	

	
	

}
