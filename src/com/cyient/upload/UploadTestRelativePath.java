package com.cyient.upload;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadTestRelativePath {

	public static void main(String[] args) {

		File file = new File("files/Profile.docx");
		String profilePath = file.getAbsolutePath();
		System.out.println(profilePath);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.naukri.com/");
		
		driver.findElement(By.id("file_upload")).sendKeys(profilePath);
	

	}

}
