package com.seleniumconcepts.SELENIUMCONCEPT.moneycontrol.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BeseTestPage {
	@FindBy(xpath="//a[contains(text(),'Hello')]")
	@CacheLookup
	public WebElement btn_login;
	

	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
 
}
