//This file contains the test script for facebook post  

package test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.FacebookPost;

public class FacebookPostMessage extends FacebookPost {

	public FacebookPostMessage()
	{
		
	}
	
	@Test
	public void add_post()
	{
		FacebookPost fp=new FacebookPost();
		driver.switchTo().alert().sendKeys("Hello World");;
		//fp.enter_message("Hello World");
		Assert.assertEquals(driver.findElement(By.className("_1mf _1mj")).getText(), "Hello World");
	}
}
