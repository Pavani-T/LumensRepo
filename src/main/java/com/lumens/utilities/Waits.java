package com.lumens.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.lumens.constants.BaseClassLumens;

public class Waits extends BaseClassLumens{

	public static long IMPLICIT_WAIT = 80;
	
	public static void waitperiod() {
		
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	
	public static void waitForVisibility(WebElement element) {
           new WebDriverWait(driver, 60)
                .until(ExpectedConditions.visibilityOf(element));
    }
}

