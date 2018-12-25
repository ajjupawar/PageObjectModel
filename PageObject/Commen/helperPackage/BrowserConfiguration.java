package helperPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BrowserConfiguration {
	
	public Properties prop;
	
	
	public BrowserConfiguration() {
		prop=new Properties();
		try {
			FileInputStream fis=new FileInputStream("C:\\Users\\Ajinkya\\workspace\\PageObject\\Commen\\Selenium.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		}
	
	public String getProperties() {
		return prop.getProperty("browser");
            
	}
	public String getUserName() {
		
		return prop.getProperty("username");
	}
	public String getPassword() {
		
		return prop.getProperty("password");
	}
	
	

}
