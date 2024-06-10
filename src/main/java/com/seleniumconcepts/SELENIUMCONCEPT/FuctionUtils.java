package com.seleniumconcepts.SELENIUMCONCEPT;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.seleniumconcepts.SELENIUMCONCEPT.moneycontrol.pages.LoginPage;

public class FuctionUtils {
	Utility util;
	PropertyReader prop;
	
	
	public void login_To_App(WebDriver driver) throws IOException
	{
		LoginPage lpage=new LoginPage(driver);
		util=new Utility();
		prop=new PropertyReader();
		util.setInputinSendkeys(lpage.txtbox_username, prop.getvaluefromProp("user1"));
		util.setInputinSendkeys(lpage.txtbox_password, prop.getvaluefromProp("password"));
		util.clickOnElement(lpage.btn_login);
	}

}
