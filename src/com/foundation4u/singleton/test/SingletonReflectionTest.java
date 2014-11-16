package com.foundation4u.singleton.test;

import java.lang.reflect.Constructor;
import java.util.Properties;

import com.foundation4u.singleton.PropertyUtilEager;

/**
 * 
 * @author Randhir
 *For running this class, please set this value(-DfilePath=<properties file location> in VM arg
 *
 */
public class SingletonReflectionTest {

	public static void main(String[] args) {
		PropertyUtilEager instance = PropertyUtilEager.getPropertyUtilInstane();
		PropertyUtilEager reflectionInstance = null;
		
		try{
			
		//Class<PropertyUtilEager> propertyUtilClass = (Class<PropertyUtilEager>) Class.forName("com.foundation4u.singleton.PropertyUtilEager");
		//reflectionInstance =  propertyUtilClass.newInstance();
			
			Constructor<PropertyUtilEager>[] constructArray = 
					(Constructor<PropertyUtilEager>[]) PropertyUtilEager.class.getDeclaredConstructors();
			for(Constructor<PropertyUtilEager> constructor : constructArray){
				constructor.setAccessible(true);
				reflectionInstance = constructor.newInstance();
			}
			
		}catch(Exception e){
			System.out.println("error: "+e);
		}
		
		System.out.println("original instance hashcode: "+instance.hashCode());
		System.out.println("reflection instance hashcode: "+reflectionInstance.hashCode());
		
		Properties properties = reflectionInstance.getPropertiesFile();
		System.out.println("design pattern is: "+properties.getProperty("pattern"));
	}

}
