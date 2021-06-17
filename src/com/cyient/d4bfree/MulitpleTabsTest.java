package com.cyient.d4bfree;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MulitpleTabsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.db4free.net/");

		driver.findElement(By.partialLinkText("phpMyAdmin")).click();
		
		Set<String> windows= driver.getWindowHandles();
		
		for(String win : windows)
		{
			driver.switchTo().window(win);
			if(driver.getTitle().equals("phpMyAdmin"))
			{
				break;
			}
		}
		
		driver.findElement(By.id("input_username")).sendKeys("miller@gmail.com");
        driver.findElement(By.id("input_password")).sendKeys("987187678");
        driver.findElement(By.id("input_go")).click();

        String actualText = driver.findElement(By.xpath("(//div[@role='alert'])[3]")).getText();
        System.out.println(actualText);
	}

}




