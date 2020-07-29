package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import common.ICommonConstants;

public class Utility implements ICommonConstants{
	
	public static WebDriver driver;

	public void openApplication(){
//		System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_LOC);
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		System.out.println("in utility...");
//		System.out.println("driver_util: "+driver);
//		System.out.println("driver in utility: "+getDriver());
		System.out.println("in utility: "+getDriver());
		getDriver().navigate().to(APP_URL);
	}
	
	public void enterText(WebElement element, String textToEnter){
		System.out.println("element - "+element);
		element.clear();
		element.sendKeys(textToEnter);
	}
	
	public void clickOn(WebElement element){
		element.click();
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
}
