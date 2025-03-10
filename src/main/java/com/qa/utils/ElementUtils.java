package com.qa.utils;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtils {

	private WebDriver driver;

    public ElementUtils(WebDriver driver) {
        this.driver = driver;
        new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void normalClick(By locator) {
    	driver.findElement(locator).click();
    }
    public void doClick(By locator) {
    	driver.findElement(locator).click();
    }
    public void dowaitClick(By locator) {
        WebElement element = new WebDriverWait(driver, Duration.ofSeconds(10))
            .until(ExpectedConditions.elementToBeClickable(locator));
        element.click();
    }
    public void doSendKeys(By locator,String value) {
    	driver.findElement(locator).sendKeys(value);
    	
    }
    public void dowaitSendKeys(By locator, String value) {
        WebElement element = new WebDriverWait(driver, Duration.ofSeconds(20))
            .until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.clear();
        element.sendKeys(value);
    }
    
    public String getPageTitle() {
        return driver.getTitle();  // Returns the current page's title
    }

	
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public List<String> getListofElements(By locator) {
		List<WebElement> lists = getElements(locator);
		List<String> addedlist = new ArrayList<String>();

		for (WebElement e : lists) {
			String text = e.getText();
			if (!text.isEmpty()) {
				addedlist.add(text);
			}
		}
		return addedlist;

	}

	
	public void selectListOfElements(By locator) {
		Select sc = new Select(getElement(locator));
		List<WebElement>elements =sc.getOptions();
		System.out.println(elements);
		}
	public void selectByvalue(By locator,String value) {
		Select sc = new Select(getElement(locator));
			sc.selectByValue(value);
		
	}
	public void selectByIndex(By locator,int value) {
		Select sc = new Select(getElement(locator));
			sc.selectByIndex(value);
		
	}
	public void selectByVisibleText(By locator, String value) {
	    Select sc = new Select(getElement(locator));
	    sc.selectByVisibleText(value); // Use selectByVisibleText instead of deselectByVisibleText
	}
	public void selectElementsByown(By locator, String value) {
	    List<WebElement> elements = driver.findElements(locator); // Directly use driver.findElements
	    for (WebElement e : elements) {
	        String text = e.getText();
	        if (text.equalsIgnoreCase(value)) {
	            e.click();
	            break; // Stop once the element is clicked
	        }
	    }
	}
	public void ExpilixitdoClick(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Wait for 10 seconds
        try {
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator)); // Wait for element to be clickable
            element.click();
        } catch (Exception e) {
            System.out.println("Element not interactable: " + e.getMessage());
        }
    }
	public WebElement waitForElementToBeClickable(By locator, int timeoutInSeconds) {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
	    return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
}
