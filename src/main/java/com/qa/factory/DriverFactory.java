package com.qa.factory;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.qa.utils.ConfigReader;

public class DriverFactory {

	private static Properties prop;

	private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

	public static WebDriver init_driver() {
		if (driver.get() == null) {
			ConfigReader configread = new ConfigReader();
			prop = configread.getConfig();
			String browser = prop.getProperty("browser");

			if (browser.equalsIgnoreCase("chrome")) {
				driver.set(new ChromeDriver());
			} else if (browser.equalsIgnoreCase("firefox")) {
				driver.set(new FirefoxDriver());
			} else {
				throw new IllegalArgumentException("Unsupported browser: " + browser);
			}
			driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		}
		
		 return driver.get();
		 
		
	}
	
	public static synchronized WebDriver getDriver() {
		return init_driver();
	}

	public static void quitDriver() {
		if (driver.get() != null) {
			driver.get().quit();
			//driver.remove();
		}
	}

}
