//This file contains the test script for Wallethub login 

package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.TestBase;
import pages.WalletHubLogin;
import pages.WalletHubSignUp;

public class WalletHubLogInTest extends TestBase{
	
	public static String walletHubLogin;
	public static String emailaddress;
	public static String pass;
	
	public WalletHubLogInTest() {
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
	public void login()
	{   driver.get(walletHubLogin); 
		WalletHubLogin login=new WalletHubLogin();
		login.enter_login_details(emailaddress, pass);
	}
	@AfterMethod
	public void tearDownTest() {
		
		//driver.quit();
	}
}
