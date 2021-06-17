package com.cyient.openemr;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class OpenEMRLogin {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://demo.openemr.io/a/openemr/interface/login/login.php?site=default");
		
		String actualSelectedValue= driver.findElement(By.xpath("//option[@selected='selected']")).getText();
		System.out.println(actualSelectedValue);
	
		Select selectLanguage=new Select(driver.findElement(By.name("languageChoice")));
		String actualSelectedValue1= selectLanguage.getFirstSelectedOption().getText();
		System.out.println(actualSelectedValue1);
	}

}
