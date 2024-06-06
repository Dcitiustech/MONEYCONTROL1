package com.seleniumconcepts.SELENIUMCONCEPT;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
		System.setProperty("Webdriver.Chrome.driver", path+"//Resourses//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(PropertyReader.getvaluefromProp("MoneycontrolURL"));
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
