package com.cyient.navigations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.navigate().to("https://magento.com/"); // same as driver.get("")

		driver.findElement(By.xpath("//*[text()='Sign in']")).click();

		//Thread.sleep(5000); //wait for 5 sec

		driver.navigate().back();

		//Thread.sleep(5000);

		driver.navigate().forward();

		//Thread.sleep(5000);

		driver.navigate().refresh();

	}

}
