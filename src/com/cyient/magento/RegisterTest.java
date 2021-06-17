package com.cyient.magento;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterTest {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
        driver.get("https://account.magento.com/customer/account/create/");
        
        driver.findElement(By.id("firstname")).sendKeys("Rak");
        driver.findElement(By.id("lastname")).sendKeys("dhu");
        driver.findElement(By.name("email")).sendKeys("RD.gmail.com");
        driver.findElement(By.id("self_defined_company")).sendKeys("Cyient");
        
        
        
        Select selectCompany=new Select(driver.findElement(By.name("company_type")));
        selectCompany.selectByVisibleText("Develops Magento extensions");
        
        Select selectRole=new Select(driver.findElement(By.name("individual_role")));
//        selectRole.selectByVisibleText("Technical/developer");
        selectRole.selectByValue("technical/developer");
        
        Select selectCountry=new Select(driver.findElement(By.id("country")));
        selectCountry.selectByIndex(3);
        
	}

}




