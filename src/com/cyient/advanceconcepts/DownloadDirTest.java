package com.cyient.advanceconcepts;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DownloadDirTest {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();

		Map<String, Object> prefs = new HashMap<String, Object>();

		prefs.put("download.default_directory", "D:\\");

		options.setExperimentalOption("prefs", prefs);
		
		options.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(options);
		
		
		
		

	}

}
