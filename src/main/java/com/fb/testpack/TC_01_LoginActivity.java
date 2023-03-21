package com.fb.testpack;

import java.io.IOException;

//import org.junit.Assert;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.fb.utilitypack.UtilityClass;

public class TC_01_LoginActivity extends TestBaseClass
{
	@Test
	public void loginActivity() throws IOException
	{
		System.out.println("apply verification");
		
		String expectedTitle = "(1) Facebook";
		
		String actualTitle = driver.getTitle();
		
		System.out.println(actualTitle);
		
		Assert.assertEquals(actualTitle, expectedTitle);
		
		//take ss
		
		UtilityClass.Screenshot(driver, "TC_01_LoginActivity");
		
		System.out.println("ss is taken");
		
//		if (expectedTitle.equals(actualTitle))
//		{
//			System.out.println("test case is passed");
//		}
//		else
//		{
//			System.out.println("test case is failed");
//		}
			
	}
}
