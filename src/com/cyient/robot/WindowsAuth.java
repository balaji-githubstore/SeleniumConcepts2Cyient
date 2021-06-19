package com.cyient.robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsAuth {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://softwaretesting.com/");
		
		//Robot class from Java
		Thread.sleep(5000);
		
		Robot rb=new Robot();
		
		String name ="balaji";
		
		for(int i=0;i<name.length();i++)
		{
			rb.keyPress(KeyEvent.getExtendedKeyCodeForChar(name.charAt(i)));
		}
		Thread.sleep(5000);
		
		rb.keyPress(KeyEvent.VK_TAB);
		
		Thread.sleep(5000);
		
		String password="pass123";
		for(int i=0;i<password.length();i++)
		{
			rb.keyPress(KeyEvent.getExtendedKeyCodeForChar(password.charAt(i)));
		}
		
		Thread.sleep(5000);
		
		rb.keyPress(KeyEvent.VK_ENTER);
	}

}










