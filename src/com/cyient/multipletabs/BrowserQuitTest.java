package com.cyient.multipletabs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserQuitTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.online.citibank.co.in/");
		
		driver.findElement(By.linkText("APPLY FOR CREDIT CARDS")).click();
			
		
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		
		//driver.close(); //close the current tab //tab 1 
		
		driver.quit(); //close the browser and kill the process
		
		

	}

}
