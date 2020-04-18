
//This file sets up the locators and objects for Facebook Home webpage
package pages;

import org.openqa.selenium.By;

public class FacebookPost extends TestBase {
  
	By txt_Message=By.name("xhpc_message");
	By txt_popup=By.className("_1mf _1mj");
	By btn_click=By.className("_1mf7 _4r1q _4jy0 _4jy3 _4jy1 _51sy selected _42ft _42fr");
	
	public FacebookPost()
	{
		
	}
	public void enter_message(String msg)
	{
		driver.findElement(txt_Message).click();
		//driver.findElement(txt_popup).sendKeys(msg);
		driver.findElement(btn_click).click();
	}
}
