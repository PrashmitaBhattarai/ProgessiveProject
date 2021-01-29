package com.cerotid.helpers;

import java.io.FileInputStream;
import java.util.Properties;


public class PropertyExtension {

	
	Properties configure;
	FileInputStream inputStream;
	
	
	public PropertyExtension() {
		
		readProperties();
	}
	
	
	public void readProperties() {
		configure = new Properties();
		 try {
			
			 inputStream = new FileInputStream("./settings.properties");
			 
			 configure.load(inputStream);
			 
		} catch (Exception e) {
			// handle exception
			
		}
		
	}


	public boolean isChrome() {
		
		String browserType = configure.getProperty("Browser");
		
		if(browserType != null && browserType.equals("Chrome")) {
			return true;
		}
		
		
		return false;
	}
}

