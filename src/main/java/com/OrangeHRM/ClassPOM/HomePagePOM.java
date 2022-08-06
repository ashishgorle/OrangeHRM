package com.OrangeHRM.ClassPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePOM

{
	WebDriver driver;
	
    //Arrow Button
	@FindBy(xpath="/html/body/div[1]/div[1]/a[2]")
	private WebElement arrowbutton;
	
	public void Clickonarrowbutton()
	{
		arrowbutton.click();
	}

	//Logout button
	@FindBy(xpath="/html/body/div[1]/div[1]/div[9]/ul/li[3]/a")
	private WebElement logout;
	
	public void Clickonlogoutbutton()
	{
		logout.click();
	}
	
	public HomePagePOM(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
}
