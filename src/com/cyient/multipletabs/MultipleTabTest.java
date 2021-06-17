package com.cyient.multipletabs;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTabTest {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.online.citibank.co.in/");

		driver.findElement(By.linkText("APPLY FOR CREDIT CARDS")).click();

		System.out.println("tab 1");
		String title = driver.getTitle();
		System.out.println(title);

		String tab1 = driver.getWindowHandle();
		System.out.println(tab1);

		System.out.println("-------------------------------------------------");

		Set<String> tabSessions = driver.getWindowHandles();

		for (String tabsession : tabSessions) {
			System.out.println(tabsession);

			driver.switchTo().window(tabsession);

			String currentTitle = driver.getTitle();
			System.out.println(currentTitle);

			if (currentTitle.equals("Citibank India")) {
				break; // exit the iteration
			}
		}

		// click on travel
		driver.findElement(By.linkText("Travel")).click();
		// type email id
		driver.findElement(By.id("Email_Id")).sendKeys("bala@gmail.com");

		driver.close();
		// click on travel

	}
}
