package com.cyient.frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HdfcLogin {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		driver.switchTo().frame("login_page");

		driver.findElement(By.xpath("//input[@class='input_password']")).sendKeys("test123");
		//click on continue
		driver.findElement(By.xpath("//img[@alt='continue']")).click();
		
		//come out of the frame
		driver.switchTo().defaultContent(); //get back to main html
		
		
//		driver.navigate().back();

	}
}
