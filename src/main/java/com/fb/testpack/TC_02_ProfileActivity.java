package com.fb.testpack;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.fb.utilitypack.UtilityClass;

public class TC_02_ProfileActivity extends TestBaseClass
{

	@Test
	public void ProfileActivityFb() throws IOException
	{
		
		
		com.fb.pompack.ProfileActivityFb pr = new com.fb.pompack.ProfileActivityFb(driver);
		pr.sampannmalavi();
		
		System.out.println("successfully click on sampann malavi");
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		System.out.println("apply verification");
		
		String expectedTitle = "Sampann Malavi | Facebook";
		
		String actualTitle = driver.getTitle();
		
		System.out.println(actualTitle);
		
		Assert.assertEquals(actualTitle,expectedTitle);
		
		UtilityClass.Screenshot(driver, "TC_02_ProfileActivity");
		
		
	}

}
