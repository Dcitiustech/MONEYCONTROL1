package com.seleniumconcepts.SELENIUMCONCEPT.moneycontrol.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BeseTestPage{

	@FindBy(xpath="//button[@id='searchButton']")
	public WebElement icon_search;
	
	@FindBy(xpath="//div[@id='dpsPatientInfoLastnameFirstname']")
	public WebElement label_patient;
	
	
public HomePage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
}
