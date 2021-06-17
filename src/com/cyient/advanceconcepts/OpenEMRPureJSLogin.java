package com.cyient.advanceconcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OpenEMRPureJSLogin {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://demo.openemr.io/a/openemr/interface/login/login.php?site=default");

		driver.executeScript("document.querySelector('#authUser').value='sss'");
		driver.executeScript("document.querySelector(\"[type='submit']\").click()");
		
	
	}

}
