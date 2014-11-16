package com.foundation4u.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtilEagerStatic {

	private static PropertyUtilEagerStatic propertyUtilEagerStatic = null;
	
	// eagerly loading static way
	static{
		propertyUtilEagerStatic = new PropertyUtilEagerStatic();
	}
	private PropertyUtilEagerStatic(){
		
	}
	
	public static PropertyUtilEagerStatic getInstance(){
		return propertyUtilEagerStatic;
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
