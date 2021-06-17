package com.cyient.dynamic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RoyalSignupTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.royalcaribbean.com/account/create");

//		driver.findElement(By.xpath("//input[@data-placeholder='First name/Given name']")).sendKeys("bala");
//		driver.findElement(By.xpath("//input[@data-placeholder='Last name/Surname']")).sendKeys("dina");
//		
//		driver.findElement(By.xpath("//span[text()='Month']")).click();
//		driver.findElement(By.xpath("//span[text()=' April ']")).click();
//
//		driver.findElement(By.xpath("//span[text()='Day']")).click();
//		driver.findElement(By.xpath("//span[text()=' 4 ']")).click();
//		
//		driver.findElement(By.xpath("//input[@data-placeholder='Year']")).sendKeys("2021");
//		
//		driver.findElement(By.xpath("//span[text()='Country/Region of residence']")).click();
//		driver.findElement(By.xpath("//span[text()=' India ']")).click();
//	    driver.findElement(By.xpath("//input[@data-placeholder='Email address']")).sendKeys("ja@gmail.com");
		
		
		//click on checkbox
		
		    driver.findElement(By.xpath("//input[@data-placeholder='First name/Given name']")).sendKeys("abcde");
	        driver.findElement(By.xpath("//input[@data-placeholder='Last name/Surname']")).sendKeys("fghij");
//	        
	        driver.findElement(By.xpath("//span[text()='Month']")).click();
	        driver.findElement(By.xpath("//span[contains(text(),'April')]")).click();
	        //as there are spaces we use contains " ,"  insted of =
	        //driver.findElement(By.xpath("//span[text()=' April ']")).click();
	        
	        driver.findElement(By.xpath("//span[text()='Day']")).click();
	        driver.findElement(By.xpath("//span[contains(text(),'3')]")).click();
	        
	        
	        driver.findElement(By.xpath("//input[@data-placeholder='Year']")).sendKeys("20003");
	        
	        
	        driver.findElement(By.xpath("//span[text()='Country/Region of residence']")).click();
	        driver.findElement(By.xpath("//span[contains(text(),' India ')]")).click();

	        
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//input[@data-placeholder='Email address']")).sendKeys("ja@gmail.com");
	        driver.findElement(By.xpath("//span[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin']")).click();
//		
//		  driver.findElement(By.xpath("//input[@data-placeholder='First name/Given name']")).sendKeys("Denis");
//	        driver.findElement(By.xpath("//input[@data-placeholder='First name/Given name']")).sendKeys("Rich");
//	        
//	        driver.findElement(By.xpath("//span[text()='Month']")).click();
//	        driver.findElement(By.xpath("//span[text()=' April ']")).click();
//	        
//	        driver.findElement(By.xpath("//span[text()='Day']")).click();
//	        driver.findElement(By.xpath("//span[contains(text(),'4')]")).click();
//	        
//	        driver.findElement(By.xpath("//input[@data-placeholder='Year']")).sendKeys("2021");
//	        
//	      //  driver.findElement(By.xpath("//div[@class='cdk-overlay-backdrop cdk-overlay-transparent-backdrop cdk-overlay-backdrop-showing']")).click();
//	        driver.findElement(By.xpath("//span[text()='Country/Region of residence']")).click();
//	        driver.findElement(By.xpath("(//span[contains(text(),'India')])[2]")).click(); 
//	        
//	        
////	        driver.findElement(By.xpath("//span[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin']")).click();
//	        driver.findElement(By.xpath("//input[@type='checkbox']/..")).click();
	}

}




