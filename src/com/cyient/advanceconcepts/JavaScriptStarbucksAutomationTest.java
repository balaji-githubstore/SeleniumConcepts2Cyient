package com.cyient.advanceconcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptStarbucksAutomationTest {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.starbucks.com/menu");
		
		
		JavascriptExecutor js =(JavascriptExecutor) driver;
		//driver.findElement(By.xpath("//span[text()='Bakery']")).click();
		js.executeScript("arguments[0].scrollIntoView()", driver.findElement(By.xpath("//span[text()='Bakery']")));
		
		Thread.sleep(5000);
			
		js.executeScript("arguments[0].click()", driver.findElement(By.xpath("//span[text()='Bakery']")));
		
		js.executeScript("window.scrollBy(0,100)");
		
		
//		js.executeScript("document.querySelector(\"input[title='Search']\").value=\"hello\"");

		
	}
}



