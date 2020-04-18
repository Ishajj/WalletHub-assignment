//This file contains the test script for wallet hub sign up 
package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.TestBase;
import pages.WalletHubSignUp;

public class WalletHubSignUpTest extends TestBase{
	
	public static String walletHubURL;
	public static String emailaddress;
	public static String pass;
	
	public WalletHubSignUpTest() {
		// TODO Auto-generated constructor stub
	} 

	TestBase tb= new TestBase();
	@BeforeMethod
	public void setUpTest() {
		
		tb.browser();
		//String projectPath=System.getProperty("user.dir");
		getProperties();
//		setProperties();
//		getProperties();
		
		}
    @Test 
	public void register()
	{   driver.get(walletHubURL); 
		WalletHubSignUp signup=new WalletHubSignUp();
		signup.enter_signup_details(emailaddress, pass, pass);
	}
	@AfterMethod
	public void tearDownTest() {
		
		//driver.quit();
	}
}
