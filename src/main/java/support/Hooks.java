package support;

import org.openqa.selenium.chrome.ChromeDriver;

import com.cucumber.listener.Reporter;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import util.Utility;

public class Hooks extends Utility{
	
	@Before
	public void initialize(){
		System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_LOC);
		setDriver(new ChromeDriver());
		getDriver().manage().window().maximize();
		System.out.println("driver: "+getDriver());
	}
	
	@After
	public void teardown(){
		getDriver().close();
		getDriver().quit();
	}
	
//	@Before
//	public void beforeScenario(Scenario scenario){
//		Reporter.assignAuthor(AUTHOR_NAME);
//	}
	
//	@After
//	public void afterScenario(Scenario scenario) throws Exception{
//		Reports.createReport();
//	}

	
	
}
