package com.cyient.medibuddy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignupTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.get("https://www.medibuddy.in/"); //wait until the page load complete

		System.out.println(driver.getTitle());
		
		driver.findElement(By.linkText("Signup")).click(); //findelement --> will findelement in 0.5sec/500ms	
		driver.findElement(By.name("firstName")).sendKeys("bala"); //findelement --> will findelement in 0.5sec/500ms
		driver.findElement(By.name("phone")).sendKeys("988888");
		driver.findElement(By.name("username")).sendKeys("bala@gmail.com");
		driver.findElement(By.name("password")).sendKeys("bala@123");
		
		driver.findElement(By.xpath("//span[text()='Are you a corporate user?']")).click();
		
		driver.findElement(By.xpath("//span[text()='Female']")).click();

	}

}
