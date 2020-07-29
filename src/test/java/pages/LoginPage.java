package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.ICommonConstants;
import cucumber.api.java.Before;
import util.Utility;

public class LoginPage extends Utility{
	
	@FindBy(name="email")
	private WebElement Email;
	
	@FindBy(name="password")
	private WebElement Password;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement Login;
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	public void enterEmail(String email){
		getEmail().sendKeys(email);
	}
	
	public void enterPassword(String password){
		getPassword().sendKeys(password);
	}
	
	public void loginToApplication(){
		getLogin().click();
	}

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getPassword() {
		return Password;
	}
	
	public WebElement getLogin() {
		return Login;
	}
	

}
