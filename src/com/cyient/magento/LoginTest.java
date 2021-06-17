package com.cyient.magento;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginTest {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://magento.com/");

		driver.findElement(By.linkText("Sign in")).click();
		
		driver.findElement(By.id("email")).sendKeys("balaji0017@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("balaji@12345");
		driver.findElement(By.id("send2")).click();
		
		//make sure portal is launched
		WebDriverWait wait=new WebDriverWait(driver,50);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText("Out")));
		
		//verification
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		if(actualTitle.equals("My Account"))
		{
			System.out.println("passed");
		}
		else
		{
			System.out.println("failed");
		}

		driver.findElement(By.partialLinkText("Out")).click();

	}
}
