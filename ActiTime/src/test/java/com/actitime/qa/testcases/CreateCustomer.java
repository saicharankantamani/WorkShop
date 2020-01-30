package com.actitime.qa.testcases;

import org.testng.annotations.Test;

import com.actitime.qa.testbase.BaseClass;
import com.actitime.webpages.ActiveProjectsandCustomers;
import com.actitime.webpages.AddNewCustomer;
import com.actitime.webpages.Loginpage;
import com.actitime.webpages.OpenTasks;

public class CreateCustomer extends BaseClass{
	@Test
public void testCreateCustomer()
{
	intialise();
	Loginpage lp=new Loginpage();
	lp.login();
	OpenTasks op=new OpenTasks();
	op.clickonpandc();
	ActiveProjectsandCustomers apc=new ActiveProjectsandCustomers();
	apc.clickonapc();
	AddNewCustomer anc=new AddNewCustomer();
	anc.entercnname();
	anc.cliconsubmmit();
	String s=apc.rtrivesuccsmsg();
	System.out.println(s);
	logout();
	close();
}
}
