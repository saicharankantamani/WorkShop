package com.actitime1.webpages;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime1.generics.BaseClass;



public class ActiveProjectsandCustomers extends BaseClass{
	public Logger log;
	@FindBy(xpath ="//input[@value='Add New Customer']")
	private WebElement addNewcustomerbutton;
		@FindBy(className = "successmsg")
		private WebElement retrivesuccesmsg;
		public ActiveProjectsandCustomers()
		{
			PageFactory.initElements(BaseClass.driver, this);
		log=Logger.getLogger(AddNewCustomer.class);
		PropertyConfigurator.configure("log4j.Properties");
		}
		public void clickonapc()
		
		{
			
			addNewcustomerbutton.click();
			log.info("click on add new customer  ");
			
			
		}
		public String rtrivesuccsmsg()
		{
			
			String s=retrivesuccesmsg.getText();
			log.info("retrive succes msg");
			return s;

		}
	}

