package test;
// This file contains the test script for wallethub add review automation 

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.TestBase;
import pages.WalletHubLogin;
import pages.WalletHubSignUp;
import pages.WalletHubURLSimulation;

public class WalletHubURLSimulationTest extends TestBase{
	
//	private static final String str = null;
	public static String walletHubLogin;
	public static String emailaddress;
	public static String pass;
	
	public WalletHubURLSimulationTest() {
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
	public void add_review()
	{   
		WalletHubURLSimulation simulation=new WalletHubURLSimulation();
	    simulation.add_review();
	    Assert.assertEquals(simulation.str, driver.findElement(By.xpath("//review-star[@class='inst-rating rvs-plain rvs-svg']")).getText());
	}
	@AfterMethod
	public void tearDownTest() {
		
		//driver.quit();
	}
}
