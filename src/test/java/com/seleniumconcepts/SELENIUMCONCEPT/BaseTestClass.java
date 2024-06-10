package com.seleniumconcepts.SELENIUMCONCEPT;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.seleniumconcepts.SELENIUMCONCEPT.moneycontrol.pages.LoginPage;

public class BaseTestClass {
	public static WebDriver driver;
	public Utility util;
	public LoginPage lpage;
	String s;
	
	@BeforeMethod
	public void browserSetUp() throws InterruptedException, IOException {
		String path = System.getProperty("user.dir");
		/*
		 * Map<String, Object> prefs = new HashMap<String, Object>();
		 * 
		 * //add key and value to map as follow to switch off browser notification
		 * //Pass the argument 1 to allow and 2 to block
		 * prefs.put("profile.default_content_setting_values.notifications", 2);
		 * 
		 * //Create an instance of ChromeOptions ChromeOptions options = new
		 * ChromeOptions();
		 * 
		 * // set ExperimentalOption - prefs options.setExperimentalOption("prefs",
		 * prefs);
		 */
		System.setProperty("Webdriver.Chrome.driver", path+"//Resourses//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(PropertyReader.getvaluefromProp("OneViewUrl"));
		//driver.get("https://www.moneycontrol.com/");
		driver.manage().window().maximize();
		Thread.sleep(20000);
		System.out.println("bbfvhbhv");
		
	}
	
	@AfterMethod
	public void deleteSession()
	{
		driver.quit();
	}

}
