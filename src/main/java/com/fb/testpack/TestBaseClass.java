package com.fb.testpack;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.fb.pompack.LoginActivityFb;

public class TestBaseClass 
{

	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SOFT\\Selenium\\chrome\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("remote-allow-origins=*");
		options.addArguments("--disable-notifications");
		
		driver = new ChromeDriver(options);
		System.out.println("successfully open chrome driver");
		
		driver.manage().window().maximize();
		System.out.println("successfully maximize window");
		
		driver.get("https://www.facebook.com/login/");
		System.out.println("successfulyy entered and opened url");
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		
		LoginActivityFb la = new LoginActivityFb(driver);
		la.username();
		System.out.println("successfully entered username");
		
		la.pass();
		System.out.println("successfully entered password");
		
		la.loginbtn();
		System.out.println("successfully click on login button");
		
		System.out.println("successfully come on home page of facebook");
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		
		driver.quit();
		System.out.println("successfully browser closed");
		System.out.println("End Of Program");
		
	}
	
	
	
	
}
