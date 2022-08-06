package com.OrangeHRM.TestClassPOM;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.OrangeHRM.ClassPOM.HomePagePOM;
import com.OrangeHRM.TestBaseClassPOM.TestBaseClass;

public class TC__002VerifyLogoutFunctionality  extends TestBaseClass
{
	@Test
	public void VerifyLogoutFunctionality()
	{
		HomePagePOM lg = new HomePagePOM(driver);
		
		lg.Clickonarrowbutton();
		
		lg.Clickonlogoutbutton();
		String actualresult = driver.getTitle();
		String expectedresult = "OrangeHRM";
		Assert.assertEquals(actualresult,expectedresult);
		
	}

}
