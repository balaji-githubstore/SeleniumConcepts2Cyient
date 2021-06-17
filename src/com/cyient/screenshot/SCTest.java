package com.cyient.screenshot;

import java.io.File;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SCTest {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://demo.openemr.io/a/openemr/interface/login/login.php?site=default");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;

		js.executeScript("document.querySelector('#authUser').value='sss'");
		js.executeScript("document.querySelector(\"[type='submit']\").click()");
		
		
	}

}
