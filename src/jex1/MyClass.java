package jex1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.junit.Test;
import org.junit.Assert;
import org.openqa.selenium.firefox.FirefoxDriver;



public class MyClass {

	 public static void main(String[] args) {
	    	System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
	    	WebDriver driver = new FirefoxDriver();
	        String baseUrl = "https://www.apple.com/mx/";
	       
	        driver.get(baseUrl);
	        WebElement macTab = driver.findElement(By.xpath("//span[text()=\"Mac\"]"));	        
	        macTab.click();
	        WebElement macText = driver.findElement(By.xpath("//h3[contains(text(), \"Ligera como\")]"));
	        Assert.assertEquals(macText.getText(),"Ligera como siempre.");
	        WebElement searchButton = driver.findElement(By.cssSelector("#ac-gn-link-search"));
	        searchButton.click();
	        WebElement searchInput = driver.findElement(By.cssSelector("#ac-gn-searchform-input"));
	        searchInput.sendKeys("iPhone XR");
	        Assert.assertEquals(driver.getTitle(), "iPhone XR - Apple (MX)");
	        WebElement ipad = driver.findElement(By.cssSelector("a[data-display-name= \"ipad\"]"));	
	        Boolean ipadEnabled = ipad.isEnabled();
	        Assert.assertEquals(ipadEnabled, true);	
	        WebElement iphone = driver.findElement(By.cssSelector("a[data-display-name= \"iphone\"]"));	
	        Boolean iphoneEnabled = iphone.isEnabled();
	        Assert.assertEquals(iphoneEnabled, true);	
	        WebElement watch = driver.findElement(By.cssSelector("a[data-display-name= \"watch\"]"));	
	        Boolean watchEnabled = watch.isEnabled();
	        Assert.assertEquals(watchEnabled, true);	
	        WebElement tv = driver.findElement(By.cssSelector("a[data-display-name= \"tv\"]"));	
	        Boolean tvEnabled = tv.isEnabled();
	        Assert.assertEquals(tvEnabled, true);	
	        
	        driver.close();
	        System.exit(0);
	    
	}
}
