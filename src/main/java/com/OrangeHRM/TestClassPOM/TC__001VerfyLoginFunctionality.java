package com.OrangeHRM.TestClassPOM;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.OrangeHRM.TestBaseClassPOM.TestBaseClass;

public class TC__001VerfyLoginFunctionality extends TestBaseClass
{


	@Test
	public void VerifyLoginFunctionality()
	{
		String actualresult = driver.getTitle();
		String expectedresult = "OrangeHRM";
		Assert.assertEquals(actualresult,expectedresult);
		
	}

}
