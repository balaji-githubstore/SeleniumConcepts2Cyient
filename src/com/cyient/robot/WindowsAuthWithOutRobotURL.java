package com.cyient.robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsAuthWithOutRobotURL {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
//		https://Username123:Password123@www.engprod2-spectrumbusiness.net
		driver.get("https://balaji:pass123@softwaretesting.com/");
		
		//Robot class from Java
		Thread.sleep(5000);
		
	}

}










