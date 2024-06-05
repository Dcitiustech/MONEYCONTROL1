package com.seleniumconcepts.SELENIUMCONCEPT;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility {
	
	public void Alerthandle()
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		if(wait.until(ExpectedConditions.alertIsPresent())==null)
		{
			System.out.println("alert was not present");
		}
		else
		{
			System.out.println("alert was present");
		}
	}


}
