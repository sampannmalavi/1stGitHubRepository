package com.fb.pompack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfileActivityFb 
{

	WebDriver driver;			// first declare global varible driver
	
	
	
	//@FindBy(linkText="(Sampann Malavi")
	@FindBy(xpath="//div[contains(@class,'x1i10hfl x1qjc9v5 xjbqb8w xjqpnuy xa49m3k xqeqjp1 x2hbi6w x13fuv20 xu3j5b3 x1q0q8m5 x26u7qi x972fbf xcfux6l x1qhh985 xm0m39n x9f619 x1ypdohk xdl72j9 x2lah0s xe8uvvx xdj266r x11i5rnm xat24cr x1mh8g0r x2lwn1j xeuugli xexx8yu x4uap5 x18d9i69 xkhd6sd x1n2onr6 x16tdsg8 x1hl2dhg xggy1nq x1ja2u2z x1t137rt x1o1ewxj x3x9cwd x1e5q0jg x13rtm0m x1q0g3np x87ps6o x1lku1pv x1a2a7pz xzsf02u x1rg5ohu')]")
	
	//WebElement sampannmalavi = driver.findElement(By.tagName("image")); 
	WebElement sampannmalavi;
	
	public void sampannmalavi()
	{
		sampannmalavi.click();
		System.out.println("successfully click on sampann malavi");
	}
	
	
	
	// this constructor is permanant always write
	public ProfileActivityFb(WebDriver driver)
	{
		//global      local
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	
}
