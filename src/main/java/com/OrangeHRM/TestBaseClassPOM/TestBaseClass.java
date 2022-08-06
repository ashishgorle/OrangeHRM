package com.OrangeHRM.TestBaseClassPOM;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.OrangeHRM.ClassPOM.LoginPagePOM;

public class TestBaseClass 
{
	public WebDriver driver;
	
	@Parameters("brawserName")
	
	 @BeforeMethod
	 
public void setup(String brawserName)
{

		if(brawserName.equals("chrome"))
		{
	System.setProperty("webdriver.chrome.driver", 
			"./driverfolder/chromedriver.exe");

	 driver = new ChromeDriver();
		}
		else if(brawserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", 
					"./driverfolder/geckodriver.exe");
			
			driver = new FirefoxDriver();
		}
		else if(brawserName.equals("edge"))
		{
			System.setProperty("webdriver.edge.driver", 
					"./driverfolder/msedgedriver.exe");
			
			 driver = new EdgeDriver();
		}
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println("open the URL");
		
		driver.manage().window().maximize();
		System.out.println("maximize the screen");
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		System.out.println("implicit waits apply");
		
		LoginPagePOM lp = new LoginPagePOM(driver);
		
		lp.enterusername();
		
		lp.enterpassword();
		
		lp.clickloginbutton();
		
}
	
	@AfterMethod
	public void AM()
	{
		driver.quit();
		System.out.println("brawser is closed");
	}
	
	
	
}
