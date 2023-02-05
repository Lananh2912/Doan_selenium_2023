package pageobjectcommon;

//import hook.DataField;
//import CucumberContext.ExcelUtils;
import org.apache.commons.lang3.StringUtils;
//import org.apache.log4j.Logger;
//import junit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObjectCommon {
	    public static WebDriver edriver;
	    public PageObjectCommon() {
	    }

	    public static void setDriver(WebDriver driver) {
	        edriver = driver;
	    }

	    public static void waitUntilElementIsVisible(WebElement element) throws Exception {
	        

	        try {
	            (new WebDriverWait(edriver, 20L)).until(ExpectedConditions.visibilityOf(element));
	        } catch (StaleElementReferenceException var2) {
	            Thread.sleep(2000L);
	            waitUntilElementIsVisible(element);
	        }

	    }
	    public static void waitUntilElementIsClickable(WebElement element) throws Exception {

	    	 
	        try {
	            (new WebDriverWait(edriver, 20L)).until(ExpectedConditions.elementToBeClickable(element));
	        } catch (StaleElementReferenceException var2) {
	            Thread.sleep(1000);
	            waitUntilElementIsClickable(element);
	        }

	    }
	    
	    public static void scrollToElement(WebElement element) {
	        ((JavascriptExecutor)edriver).executeScript("window.scrollBy(0,-100)", new Object[0]);
	        ((JavascriptExecutor)edriver).executeScript("arguments[0].scrollIntoView(true);", new Object[]{element});
	    }

	    public static void waitUntilElementIsEmpty(WebElement element) throws Exception {
	  

	        try {
	            (new WebDriverWait(edriver, 20L)).until(ExpectedConditions.attributeToBe(element, "value", ""));
	        } catch (StaleElementReferenceException var2) {
	            Thread.sleep(2000L);
	            waitUntilElementIsEmpty(element);
	        }

	    }
	    public void focusClick(WebElement element) throws Exception {
	        try {
	            (new WebDriverWait(edriver, 20L)).until(ExpectedConditions.elementToBeClickable(element));
	        } catch (StaleElementReferenceException var3) {
	            Thread.sleep(5000L);
	        } catch (Exception var4) {
	        }

	        waitUntilElementIsVisible(element);
	        scrollToElement(element);
	        ((JavascriptExecutor)edriver).executeScript("arguments[0].focus();", new Object[]{element});
	        waitUntilElementIsClickable(element);
	        
	        ((JavascriptExecutor)edriver).executeScript("arguments[0].click();", new Object[]{element});
	    }
	    public void sendKeys(WebElement element, String text) throws Exception {
	        this.focusClick(element);
	        element.clear();
	        if (StringUtils.isNotEmpty(element.getAttribute("value"))) {
	            for(int i = element.getAttribute("value").length(); i > 0; --i) {
	                element.sendKeys(new CharSequence[]{Keys.BACK_SPACE});
	            }
	        }

	        waitUntilElementIsEmpty(element);
	        element.sendKeys(new CharSequence[]{text});
	    }

	    public void enterNonEmptyValue(WebElement webElement, String value) throws Exception {
	        if (StringUtils.isNotEmpty(value)) {
	            this.sendKeys(webElement, value);
	        }

	    }
	    
	    

	}
