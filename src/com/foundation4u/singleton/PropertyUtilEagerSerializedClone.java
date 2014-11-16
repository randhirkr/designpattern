package com.foundation4u.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.Properties;

public class PropertyUtilEagerSerializedClone implements Serializable, Cloneable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8025759097099213057L;
	
	private static final PropertyUtilEagerSerializedClone INSTANCE = new PropertyUtilEagerSerializedClone();
	
	private PropertyUtilEagerSerializedClone(){
		
	}

	public static PropertyUtilEagerSerializedClone getInstance(){
		return INSTANCE;
	}
	
	//it will always give same object on deserialization
	protected Object readResolve(){
		return getInstance();
	}
	
	public Object clone() throws CloneNotSupportedException {
		return getInstance();
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
