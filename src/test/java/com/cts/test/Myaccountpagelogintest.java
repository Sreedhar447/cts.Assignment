package com.cts.test;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cts.Testbase.TestBase;
import com.cts.pages.Myaccountpage;
import com.cts.pages.Myaccountpagelogin;

public class Myaccountpagelogintest extends TestBase{
	
	Myaccountpagelogin pagelogin;
	Myaccountpage page;
	public Myaccountpagelogintest() {
		super();
	}
	@BeforeMethod
	public void setp() {
		initilization();
	}
	@Test
	public void checktitle() {
		pagelogin.setup();
		Assert.assertEquals(driver.getTitle(), "My Account &#8211; Automation Practice Site");
	}
	
	
	@AfterMethod
	public void teardown() {
		driver.close();
	}
	

}
