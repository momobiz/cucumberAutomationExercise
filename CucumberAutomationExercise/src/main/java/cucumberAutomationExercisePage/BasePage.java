package cucumberAutomationExercisePage;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
	static WebDriver driver;
	static Logger logger=Logger.getLogger(BasePage.class.getName());
	static WebDriverWait wait;
	static JavascriptExecutor js;
	static Select select;
	
	public static void launchBrowser(String browserName) {
		driver=Browser.getInstance().getDriver(browserName);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public static void openUrl(String url) {
		driver.get(url);
	}
	
	public boolean isDisplayed(WebElement element) {
		wait=new WebDriverWait(driver, 10);
		
		try {
			wait.until(ExpectedConditions.visibilityOf(element));
			
		} catch (Exception e) {
	       System.out.println(e.getMessage());
	       return false;
		}
		return true;
		
		
	}
	public void fillInput(WebElement element, String str) {
		element.clear();
		element.sendKeys(str);
	}
	
	public void selectRadioButton(List<WebElement> radios, String gender) {
		for(WebElement radio:radios) {
			if(radio.getAttribute("value").contentEquals(gender)) radio.click();
		}
		
	}
	public String convertToCamelCase(String str) {
		String str1=str.toLowerCase();
		return Character.toUpperCase(str1.charAt(0))+str1.substring(1);
	}
	
	public void scrollDown(int pixelNumber) {
		js=(JavascriptExecutor) driver;
		js.executeScript("scroll(0,"+pixelNumber+")");
		
	}
	
	public void selectOption(WebElement dropdown, String option) {
		select=new Select(dropdown);
		select.selectByValue(option);
		
	}
	
	public void selectCheckbox(WebElement element) {
		if(!element.isSelected()) element.click();
	}
	public void deseclectCheckbox(WebElement element) {
		if(element.isSelected()) element.click();
	}

}
