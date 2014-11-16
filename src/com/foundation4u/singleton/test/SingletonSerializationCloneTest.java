package com.foundation4u.singleton.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.Properties;

import com.foundation4u.singleton.PropertyUtilEagerSerializedClone;
/**
 * 
 * @author Randhir
 * For running this class, please set this value(-DfilePath=<properties file location> in VM arg
 */
public class SingletonSerializationCloneTest {

	public static void main(String[] args) {
		PropertyUtilEagerSerializedClone propertyUtil = PropertyUtilEagerSerializedClone.getInstance();
		
		ObjectOutput objectOutput = null;
		try {
			objectOutput = new ObjectOutputStream(new FileOutputStream("singleton.obj"));
			objectOutput.writeObject(propertyUtil);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(objectOutput != null){
				try {
					objectOutput.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		ObjectInput objectInput = null;
		PropertyUtilEagerSerializedClone serializedInstance = null;
		try {
			objectInput = new ObjectInputStream(new FileInputStream("singleton.obj"));
			serializedInstance = (PropertyUtilEagerSerializedClone) objectInput.readObject();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(objectInput != null){
				try {
					objectInput.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		// Test if objects are same
		System.out.println("original instance hashcode: "+propertyUtil.hashCode());
		System.out.println("serialized instance hashcode: "+serializedInstance.hashCode());
		
		// clone the original instance
		try {
			PropertyUtilEagerSerializedClone cloneInstance = 
					(PropertyUtilEagerSerializedClone) propertyUtil.clone();
			System.out.println("cloneable instance hashcode: "+cloneInstance.hashCode());
			Properties properties = cloneInstance.getPropertiesFile();
			System.out.println("design pattern is: "+properties.getProperty("pattern"));
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
