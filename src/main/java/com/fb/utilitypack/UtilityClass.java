package com.fb.utilitypack;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass 
{

	 //this class for screenshots
	
	public static void Screenshot(WebDriver driver,String name) throws IOException
	
	{
		
		TakesScreenshot ts = (TakesScreenshot)driver;		//TakesScreenshot is interface
		
		File Sourcefile = ts.getScreenshotAs(OutputType.FILE);		//
		
		File folder = new File("D:\\Velocity\\Automation\\Selenium Automation\\SS\\ss fb\\"  +name + ".jpg");
		
		FileHandler.copy(Sourcefile, folder);
	
	
	}
	
	
	
	
	
}
