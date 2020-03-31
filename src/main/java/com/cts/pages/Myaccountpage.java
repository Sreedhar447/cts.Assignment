package com.cts.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cts.Testbase.TestBase;

public class Myaccountpage extends TestBase {

	@FindBy(xpath = " //a[contains(text(),'My Account')]")
	WebElement btnmyaccount;
	@FindBy(xpath = "//input[@id='username']")
	WebElement username;
	@FindBy(xpath = "//input[@id='password']")
	WebElement password;
	@FindBy(xpath = "//input[@name='login']")
	WebElement loginbtn;
	
	public Myaccountpage() {
		PageFactory.initElements(driver, this);
	}
	public Myaccountpagelogin myaccountpageclick() {
		btnmyaccount.click();
		return new Myaccountpagelogin();
		
	}
public String title() {
	String str = driver.getTitle();
	System.out.println(str);
	return str;
	
}
public void login() {
	btnmyaccount.click();
	username.sendKeys("sreedhar");
	password.sendKeys("Sree123");
	loginbtn.click();
	
}
}
