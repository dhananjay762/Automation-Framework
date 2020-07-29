package common;

public interface ICommonConstants {
	
	String CHROME_DRIVER_LOC = "drivers/chromedriver.exe";
	String APP_URL = "https://www.phptravels.net/admin";
	
	//Report Configuration
	String CONFIG_PROPERTY_FILE = "./config/config.properties";
	String REPORT_CONFIG_PROPERTY = "reportConfigPath";
	String AUTHOR_NAME = "Dhananjay Dewangan";
	String USER_NAME = System.getProperty("user.name");
	String TIME_ZONE = System.getProperty("user.timezone");
	String MACHINE = "Windows 10 " + "64 Bit";
	String JAVA_VERSION = System.getProperty("java.version");

}
