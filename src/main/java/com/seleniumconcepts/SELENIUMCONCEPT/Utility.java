package com.seleniumconcepts.SELENIUMCONCEPT;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility {
	
	public void Alerthandle(WebDriver driver)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		if(wait.until(ExpectedConditions.alertIsPresent())==null)
		{
			System.out.println("alert was not present");
		}
		else
		{
			System.out.println("alert was present");
			Alert alert=driver.switchTo().alert();
			alert.accept();
		}
	}

	public void selectedCheckBox(WebDriver driver, WebElement ele)
	{
		boolean isselected=ele.isSelected();
		
		if(isselected==false)
		{
			ele.click();
		}
	}
	public void selectedradiobutton(WebDriver driver, WebElement ele)
	{
		boolean isselected=ele.isSelected();
		
		if(isselected==false)
		{
			ele.click();
		}
	}
	public void selectByvalue(WebDriver driver, WebElement ele,Select sel,String value)
	
	{
		sel=new Select(ele);
		sel.selectByValue(value);
		
	}
public void selectByvisibleText(WebDriver driver, WebElement ele,Select sel,String Text)
	
	{
		sel=new Select(ele);
		sel.selectByVisibleText(Text);;
		
	}
public void multiselect(WebDriver driver, WebElement ele,Select sel,String Text)

{
	sel=new Select(ele);
	if(sel.isMultiple()==true)
	{
		List<WebElement> lst=sel.getOptions();
		for(int i=0;i<lst.size();i++)
		{
			if(lst.get(i).getText().equalsIgnoreCase(Text))
			{
				lst.get(i).click();
			
			}
		}
	}
	
	
	
}

public void setPageloadtimeout(WebDriver driver)
{
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
}
public void waitforElementtoload(WebDriver driver)
{
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
}
public void waitforcondtiontomeetforelement(WebDriver driver,WebElement element)
{
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(5000));
	wait.until(ExpectedConditions.visibilityOf(element));
	
}

public void getchildWindow(WebDriver driver)
{
	String mainwindow=driver.getWindowHandle();
	Set<String> childwindow=driver.getWindowHandles();
	Iterator<String> itr=childwindow.iterator();
	 while(itr.hasNext())
	 {
		 String childwindow1=itr.next();
		 if(!mainwindow.equalsIgnoreCase(childwindow1))
		 {
			 driver.switchTo().window(childwindow1);
		 }
	 }
}
public void setInputinSendkeys(WebElement ele, String text)
{
	ele.sendKeys(text);
}
public void clickOnElement(WebElement ele)
{
	ele.click();
}
}
