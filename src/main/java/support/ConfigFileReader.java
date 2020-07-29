package support;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import common.ICommonConstants;

public class ConfigFileReader implements ICommonConstants{
	
	public String getReportConfigPath() throws IOException{
		Properties properties = new Properties();
		FileReader reader = new FileReader(CONFIG_PROPERTY_FILE);
		properties.load(reader);
		String reportConfigPath = properties.getProperty(REPORT_CONFIG_PROPERTY);
		if(reportConfigPath!=null){
			return reportConfigPath;
		}else{
			throw new RuntimeException("run time exception");
		}
			
	}

}
