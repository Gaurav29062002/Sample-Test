package Utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
	
	static Properties prop;
	
	public static Properties getProperty() {
		prop = new Properties();
		
		try {
			FileInputStream fis = new FileInputStream("src/test/resources/config.properties");
			prop.load(fis);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return prop;
	}
	

}
