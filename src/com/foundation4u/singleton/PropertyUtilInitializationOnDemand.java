package com.foundation4u.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * 
 * @author Randhir
 *This lazy-loaded singleton implementation is based on initialization on Demand Holder (design pattern) idiom.
 *Reference: http://en.wikipedia.org/wiki/Initialization-on-demand_holder_idiom
 *
 */
public class PropertyUtilInitializationOnDemand {
	
	private PropertyUtilInitializationOnDemand(){
		
	}
	//Inner static class
	private static class SingletonHolder{
		private static final PropertyUtilInitializationOnDemand INSTANCE = 
				new PropertyUtilInitializationOnDemand();
	}
	
	public static PropertyUtilInitializationOnDemand getInstance(){
		return SingletonHolder.INSTANCE;
	}
	
	public Properties getPropertiesFile(){
		String propFilePath = System.getProperty("filePath")+File.separator+"design.properties";
		System.out.println("file path: "+propFilePath);
		
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream(propFilePath));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return properties;
	}

}
