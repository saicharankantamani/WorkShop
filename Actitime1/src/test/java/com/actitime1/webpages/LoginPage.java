package com.actitime1.webpages;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime1.generics.BaseClass;




public class LoginPage extends BaseClass{
	public Logger log;
	@FindBy(name="username")
private WebElement un;
@FindBy(name="pwd")
private WebElement psd;
@FindBy(css="input[type='submit']")
private WebElement loginnow;
public  LoginPage()
{
	PageFactory.initElements(BaseClass.driver, this);
	log=Logger.getLogger(AddNewCustomer.class);
	PropertyConfigurator.configure("log4j.Properties");
}
public void login()
{
	/*un.sendKeys(pro.getProperty("un"));
	un.sendKeys("admin");
	psd.sendKeys(pro.getProperty("pwd"));*/
	un.sendKeys("admin");
	log.info("enter username");
	psd.sendKeys("manager");
	log.info("enter password");
	loginnow.click();
	log.info("click on login");
}
}



