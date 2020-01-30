package com.actitime1.testscripts;

import org.testng.annotations.Test;

import com.actitime1.generics.BaseClass;
import com.actitime1.webpages.ActiveProjectsandCustomers;
import com.actitime1.webpages.AddNewCustomer;
import com.actitime1.webpages.OpenTasks;


public class CreateCustomerTC_01 extends BaseClass 
{
	@Test
	public void testCreateCustomerTC_01()
	{
		OpenTasks otp=new OpenTasks();
		otp.ClickonProjectsandCustomerslink();
		ActiveProjectsandCustomers apc=new ActiveProjectsandCustomers();
		apc.clickonapc();
		AddNewCustomer anc=new AddNewCustomer();
		anc.entercnname();
		anc.cliconsubmmit();
		String s=apc.rtrivesuccsmsg();
		System.out.println(s);}

}
