package cucumberAutomationExercisePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
	static WebDriver driver;
	static Browser browser = null;

	private Browser() {

	}

	public static Browser getInstance() {
		if (browser == null) {
			browser = new Browser();
		}
		return browser;
	}

	public static WebDriver getDriver(String driverName) {
		switch (driverName) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		default:
			System.out.println("driver must be chrome or firefox");
			break;

		}
		return driver;
	}

}
