package com.qa.stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import com.qa.factory.DriverFactory;
import com.qa.utils.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class AppHooks {
	
	@Before
	public void setUp() {
		WebDriver driver =DriverFactory.getDriver();
		//DriverFactory.getDriver();
		ConfigReader configreader= new ConfigReader();
		driver.get(configreader.getConfig().getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.parseInt(configreader.getConfig().getProperty("implicitWait"))));
			
	}
	@After
	public void TearDown() {
		DriverFactory.quitDriver();
	}

}
