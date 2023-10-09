package com.testNGPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testNGbasic {
	      @Test
          public void windowHandling() {
        	  ChromeDriver driver = new ChromeDriver();
        	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        	  driver.get("https://www.google.com/");
        	  driver.findElement(By.name("q")).sendKeys("cricket",Keys.ENTER);
        	  List<WebElement> crickets = driver.findElementsByXpath("//*[contains(text(),'cricket') or contains(test
        			  
          }
}
