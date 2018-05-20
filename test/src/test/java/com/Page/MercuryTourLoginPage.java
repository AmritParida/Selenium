package com.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MercuryTourLoginPage {
	
	WebDriver driver;
	
	@FindBy(how=How.NAME,using="userName")
	WebElement username;
	@FindBy(how=How.NAME,using="password")
	WebElement password;
	@FindBy(how=How.XPATH,using="//input[@value='Login']")
	WebElement signin;
	@FindBy(how=How.LINK_TEXT,using="REGISTER")
	WebElement register;

	public MercuryTourLoginPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public String clickLogin()
	{
		username.sendKeys("mercury");
		password.sendKeys("mercury");
		signin.click();
		return driver.getTitle();	
	}
	
	public String clickRegister()
	{
		register.click();
		return driver.getCurrentUrl();
	}

}