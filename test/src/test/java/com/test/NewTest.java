package com.test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.Page.MercuryTourRegisterPage;
import com.Page.MercuryTourLoginPage;

import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest {
	
 WebDriver driver;
 MercuryTourLoginPage mtwp;
 MercuryTourRegisterPage mtrp;
 
  @Test(priority=1)
  public void testMercuryToursWelcome()
  {
	  driver.get("http://newtours.demoaut.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
  }
	
  @Test(priority=3)
  public void testMercuryToursLogin() {
	  
	String title=  mtwp.clickLogin();
	AssertJUnit.assertTrue(title.contains("Find a Flight"));
	  
  }
  @Test(priority=2)
  public void testMercuryToursRegister() {
	  
	  String url=mtwp.clickRegister();
	  AssertJUnit.assertTrue(url.contains("register"));
	  mtrp.clickUserInfo();
	  mtrp.clickSignOFF();
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  mtwp=PageFactory.initElements(driver,MercuryTourLoginPage.class);
	  mtrp=PageFactory.initElements(driver,MercuryTourRegisterPage.class);
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
	  mtwp=null;
	  mtrp=null;
  }

  
  
}