package com.OrangeHRM.ClassPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePOM 
{
	 WebDriver driver;
	
	//User Name 
	@FindBy(xpath="/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[2]/input")
	private WebElement username;
	
	public void enterusername()
	{
		username.sendKeys("Admin");
	}

	
	//Password
	@FindBy(xpath="/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[3]/input")
	private WebElement password;
	
	public void enterpassword()
	{
		password.sendKeys("admin123");
	}
	
	//Button
	@FindBy(xpath="/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[5]/input")
	private WebElement clickbutton;
	
	public void clickloginbutton()
	{
		clickbutton.click();
	}
	
	public LoginPagePOM(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
}
