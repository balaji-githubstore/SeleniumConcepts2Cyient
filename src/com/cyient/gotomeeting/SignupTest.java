package com.cyient.gotomeeting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SignupTest {

	public static void main(String[] args) {
	       WebDriver driver = new ChromeDriver();
           driver.manage().window().maximize();
           driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
           
           driver.get(" https://www.gotomeeting.com/en-in\r\n");
           driver.findElement(By.linkText("Start for Free")).click();
           
           //click on the //button[text()='Accept Recommended Settings']
//           driver.findElement(By.id("truste-consent-close")).click();
           
           
           driver.findElement(By.id("first-name")).sendKeys("Aditya");
           driver.findElement(By.id("last-name")).sendKeys("Kale");
           driver.findElement(By.id("login__email")).sendKeys("adi@gmail.com");
           driver.findElement(By.id("contact-number")).sendKeys("77777");
           
           Select selectjob= new Select(driver.findElement(By.id("JobTitle")));
           selectjob.selectByVisibleText("Help Desk");
           
           driver.findElement(By.xpath("//input[@value='10-99']")).click();
           driver.findElement(By.xpath("//button[@data-button='trial-submit']")).click();

	}

}
