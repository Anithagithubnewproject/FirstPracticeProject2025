package com.qa.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class  ConfigReader {
	
	private Properties prop;
	
	public Properties getConfig() {
		prop=new Properties();
		
		try {
			FileInputStream fis=new FileInputStream("src\\test\\resources\\Config\\configread.properties");
			try {
				prop.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop;
		
	}
	

}
