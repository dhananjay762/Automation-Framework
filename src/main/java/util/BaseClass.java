package util;

import util.Utility;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import cucumber.api.java.Before;

public class BaseClass extends Utility{
	
	
//	@Parameters("browser")
//	@BeforeClass
//	public void configureBrowser(String browser){
//		if(browser.equalsIgnoreCase("Chrome")){
//			System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_LOC);
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//		}
//		
//		else if(browser.equalsIgnoreCase("Edge")){
//			
//		}
//		
//		else if(browser.equalsIgnoreCase("IE")){
//			
//		}
//		
//		else{
//			System.out.println("Invalid Browser...");
//		}
//	}
//	
//	@AfterClass
//	public void closeBrowser(){
//		driver.close();
//		driver.quit();
//	}
	
//	@Before
//	public void configureBrowser(){
//		System.out.println("in befoer class");
//		System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_LOC);
//		super.setDriver(new ChromeDriver());
//		//super.driver = new ChromeDriver();
//		super.getDriver().manage().window().maximize();
//		System.out.println("driver: "+super.driver);
//		//getDriver().navigate().to(APP_URL);
//		System.out.println("before class completed...");
//	} 

}
