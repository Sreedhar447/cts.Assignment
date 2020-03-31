package com.cts.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cts.Testbase.TestBase;
import com.cts.pages.Myaccountpage;

public class Myaccountpagetest extends TestBase {
   Myaccountpage pagetest;
  
   
    public Myaccountpagetest() {
	super();
}
	@BeforeMethod
	public void setup() {
		initilization();
		pagetest = new Myaccountpage();
		
		
	}
	@Test(priority = 1)
	public void landpagetest() {
		pagetest.myaccountpageclick();
	}
	@Test(priority = 2)
	public void titlecheck() {
		pagetest.title();
		
		Assert.assertEquals(driver.getTitle(), "Automation Practice Site");
		
	}
	
	@Test(priority = 3)
	public void logincheck() {
		pagetest.login();
	}
	
	@AfterMethod
	public void browserclose() {
		driver.close();
	}
	
	
}
