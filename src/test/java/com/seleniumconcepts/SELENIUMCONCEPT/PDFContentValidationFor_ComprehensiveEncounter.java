package com.seleniumconcepts.SELENIUMCONCEPT;

import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.seleniumconcepts.SELENIUMCONCEPT.moneycontrol.pages.HomePage;
import com.seleniumconcepts.SELENIUMCONCEPT.moneycontrol.pages.LoginPage;

public class PDFContentValidationFor_ComprehensiveEncounter extends BaseTestClass{
	String max;
	double m=0,r=0;
	Utility util;
	PropertyReader prop;
	FuctionUtils futils;
	LoginPage lpage;
	HomePage homepage;
	
	/*
	 * @Test public void login_To_App() throws IOException { LoginPage lpage=new
	 * LoginPage(driver); util=new Utility(); prop=new PropertyReader();
	 * util.setInputinSendkeys(lpage.txtbox_username,
	 * prop.getvaluefromProp("user1"));
	 * util.setInputinSendkeys(lpage.txtbox_password,
	 * prop.getvaluefromProp("password")); util.clickOnElement(lpage.btn_login); }
	 */
	
	@Test
	public void verifyHomepage() throws IOException, InterruptedException
	{
		lpage=new LoginPage(driver);
		homepage=new HomePage(driver);
		futils=new FuctionUtils();
		util=new Utility();
		prop=new PropertyReader();
		futils.login_To_App(driver);
		util.setPageloadtimeout(driver);
		String title= driver.getTitle();
		Assert.assertSame("Physician Solutions",title,"Actual title is not same as expected title");
		util.waitforcondtiontomeetforelement(driver, homepage.icon_search);
		util.clickOnElement(homepage.icon_search);
		util.waitforcondtiontomeetforelement(driver, homepage.label_patient);
		util.clickOnElement(homepage.label_patient);
		util.setPageloadtimeout(driver);
		Thread.sleep(Duration.ofSeconds(10));
	}

	@Test
    public void findMaxValueinWebtable() throws ParseException
    {
		util=new Utility();
		util.Alerthandle(driver);
		
       WebElement table= driver.findElement(By.className("dataTable"));
     List<WebElement> lst_rows=  table.findElements(By.xpath("//tr//td[1]"));
      List<WebElement> lst_columns=table.findElements(By.xpath("//tr//th"));
     int row_size=lst_rows.size();
     int col_size= lst_columns.size();
     System.out.println("row size is: "+row_size+"column size is :"+col_size);
     System.out.println("jhhhh");
     for(int i=1;i< row_size-1;i++)
     {
    	 max=driver.findElement(By.xpath("//table[@class='dataTable']//tr["+(i+1)+"]//td[4]")).getText();
    	 NumberFormat f=NumberFormat.getInstance();
    	
			Number num =f.parse(max);
		   max=num.toString();
		  m= Double.parseDouble(max);
		  if(m>r)
		  {
			  r=m;
		  }
     }
     System.out.println("Maximum current price is:"+r);
    }
	
	
@Test
public void loginToMoneyControl()
{
	lpage=new LoginPage(driver);
//	Actions act=new Actions(driver);
	
	//driver.switchTo().alert().accept();
	
	//act.moveToElement(lpage.btn_login);
	driver.switchTo().frame(0);
	util.Alerthandle(driver);
	util.waitforcondtiontomeetforelement(driver,lpage.btn_login );
	lpage.btn_login.click();
}
}
