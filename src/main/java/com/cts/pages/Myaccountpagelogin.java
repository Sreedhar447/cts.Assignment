package com.cts.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cts.Testbase.TestBase;

public class Myaccountpagelogin extends TestBase{
	Myaccountpage myaccountpage;
	@FindBy(xpath = " //a[contains(text(),'My Account')]")
	WebElement btnmyaccount;
	@FindBy(xpath = "//input[@id='username']")
	WebElement username;
	@FindBy(xpath = "//input[@id='password']")
	WebElement password;
	@FindBy(xpath = "//input[@name='login']")
	WebElement loginbtn;
	public Myaccountpagelogin() {
		PageFactory.initElements(driver, this);
	}
	
	public void setup() {
		myaccountpage = new Myaccountpage();
		myaccountpage.myaccountpageclick();
		driver.getTitle();
	}

	

}
