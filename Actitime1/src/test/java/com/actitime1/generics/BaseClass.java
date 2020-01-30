package com.actitime1.generics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class BaseClass {
	public static WebDriver driver;
	 
	Logger log=Logger.getLogger(BaseClass.class);

	@BeforeTest
	public void OpenBrowser() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
			PropertyConfigurator.configure("log4j.Properties");
			System.setProperty("webdriver.chrome.driver", "C://drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("http://127.0.0.1:81/login.do");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
	}
	@AfterTest
	public void CloseBrowser()
	{
		//log=Logger.getLogger(BaseClass.class);
		PropertyConfigurator.configure("log4j.Properties");
		log.info("browser closed");
		driver.close();
}
	@BeforeClass
	public void login() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		//log=Logger.getLogger(BaseClass.class);
		PropertyConfigurator.configure("log4j.Properties");
		log.info("user name entered");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		log.info("password enterd");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		log.info("clicked on subbmit button");
	}
	@AfterClass
	public void logout() {
		//log=Logger.getLogger(BaseClass.class);
	PropertyConfigurator.configure("log4j.Properties");
		driver.findElement(By.className("logoutImg")).click();
		log.info("clicked on logout bottuon");
	}
}
