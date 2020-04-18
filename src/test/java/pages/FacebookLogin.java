//This file sets up the locators and objects for Facebook login webpage

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class FacebookLogin extends TestBase{
    
	//public WebDriver driver;
	By txt_email_phone=By.id("email");
	By txt_password=By.id("pass");
	//By titleText=By.id("Facebook – log in or sign up");
	By btn_id=By.id("u_0_b");
	
	
	public FacebookLogin()
	{
//		this.driver=driver;	
//		PageFactory.initElements(driver, this);
    }
	
	public void setUserName(String strUsername)
	{
		driver.findElement(txt_email_phone).sendKeys(strUsername);
	}
	public void setPass(String strpass)
	{
		driver.findElement(txt_password).sendKeys(strpass);
	}
	public void clickLoginbtn()
	{
		driver.findElement(btn_id).click();
	}
}
