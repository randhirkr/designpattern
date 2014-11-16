package com.foundation4u.singleton.test;

import java.util.Properties;

import com.foundation4u.singleton.PropertyUtilEnum;
import com.foundation4u.singleton.PropertyUtilInitializationOnDemand;
import com.foundation4u.singleton.PropertyUtilLazy;
import com.foundation4u.singleton.PropertyUtilLazyDoubleLocking;

/**
 * 
 * @author Randhir
 *For running this class, please set this value(-DfilePath=<properties file location> in VM arg
 *
 */
public class SingletonTest {

	public static void main(String[] args) {
		//PropertyUtilEager propertyUtil = PropertyUtilEager.getPropertyUtilInstane();
		//PropertyUtilEagerStatic propertyUtil = PropertyUtilEagerStatic.getInstance();
		//PropertyUtilLazy propertyUtil = PropertyUtilLazy.getInstance();
		//PropertyUtilLazyDoubleLocking propertyUtil= PropertyUtilLazyDoubleLocking.getInstance();
		//PropertyUtilInitializationOnDemand propertyUtil = PropertyUtilInitializationOnDemand.getInstance();
		
		PropertyUtilEnum propertyUtil = PropertyUtilEnum.INSTANCE;
		
		Properties properties = propertyUtil.getPropertiesFile();
		System.out.println("design pattern is: "+properties.getProperty("pattern"));
	}

}
