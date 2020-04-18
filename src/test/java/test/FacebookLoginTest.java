
//This file contains the test script for facebook login 

package test;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.FacebookLogin;
import pages.TestBase;
public class FacebookLoginTest extends TestBase{
	
	public FacebookLoginTest() {
		
		// TODO Auto-generated constructor stub
	}

	public static String userName;
	public static String passName;
	public static String urlName;
 
	TestBase tb= new TestBase();
	@BeforeMethod
	public void setUpTest() {
		
		tb.browser();
		//String projectPath=System.getProperty("user.dir");
		getProperties();
//		setProperties();
//		getProperties();
		
		}
			//logger.info("Browser started");
		
		@Test
		public void loginTest() {
			
			FacebookLogin fl=new FacebookLogin();
			driver.get(urlName);
			fl.setUserName(userName);
			fl.setPass(passName);
			fl.clickLoginbtn();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Assert.assertEquals(driver.getTitle(), "Facebook");
			
		}
		@AfterMethod
		public void tearDownTest() {
			
			//driver.quit();
		}
	}

