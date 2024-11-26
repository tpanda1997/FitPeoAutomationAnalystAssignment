package utilties;


import java.io.FileReader;
import java.util.Properties;
import java.util.ResourceBundle;

public class readProperties {

	
	public ResourceBundle getProperty(String propertyName) {
		
		
		return ResourceBundle.getBundle(propertyName);
			
		
	}
	
	
	public Properties readProp() {
		Properties prop = new Properties();
		
		try {
			
			FileReader reader = new FileReader(".\\config.properties");
			
			prop.load(reader);
			
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		
		return prop;
		
	}
}
