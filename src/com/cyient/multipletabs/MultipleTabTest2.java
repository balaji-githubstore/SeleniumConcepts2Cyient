package com.cyient.multipletabs;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTabTest2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.online.citibank.co.in/");

		driver.findElement(By.linkText("APPLY FOR CREDIT CARDS")).click();
		
		Set<String> tabSessions= driver.getWindowHandles();
		for(String tabsession : tabSessions)
		{
			driver.switchTo().window(tabsession);
			String currentTitle = driver.getTitle();
			if (currentTitle.equals("Citibank India")) {
				break; // exit the iteration
			}
		}
		
		
		//click on travel
		//type email id
		
		driver.close();
		//click on travel
		
		//will take 2:05 PM IST
		
	}
}




