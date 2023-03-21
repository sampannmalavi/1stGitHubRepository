package com.fb.pompack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

public class LoginActivityFb 
{

	// first declared global variable WebDriver
	
	WebDriver driver;
	
	//write the beforeMethod & create method with name "setUp" find the elements of 
	// login activiy,
	
	
	@FindBy(xpath="//input[@id='email']")
	WebElement username;
	
		// for performing action create method for it
	
	public void username()
	{
		username.sendKeys("7038396668");
	}
	
	@FindBy(xpath="//input[@id='pass']")
	WebElement pass;
	
	public void pass()
	{
		pass.sendKeys("malavis6668");
	}
	
	@FindBy(xpath="//button[@name='login']")
	WebElement login;
	
	public void loginbtn()
	{
		login.click();
	}
	
	
	public LoginActivityFb(WebDriver driver)
	{
		//global      local
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	
	
}
