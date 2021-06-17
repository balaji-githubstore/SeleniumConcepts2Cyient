package com.cyient.advanceconcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeTest {

	public static void main(String[] args) {
		
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		
		ChromeDriver driver = new ChromeDriver(option);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.reliancedigital.in/");

	}

}
