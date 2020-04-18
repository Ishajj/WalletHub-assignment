//This file is intended for the common initializations for objects used throughout the suite
//Another intention is it reads the variable value of Object.properties file

package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.TestBase;
import test.FacebookLoginTest;
import test.WalletHubLogInTest;
import test.WalletHubSignUpTest;

//import com.sun.xml.fastinfoset.sax.Properties;

public class PropertiesFile {
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static WebElement el;
	static Properties prop=new Properties();
	static String projectPath=System.getProperty("user.dir");
	
	public PropertiesFile()
	{
//		this.driver=driver;	
		PageFactory.initElements(driver, this);
	}
	public static void getProperties()
	{
		
	    try {
			InputStream input=new FileInputStream(projectPath+"/src/test/java/config/Object.properties");
	        prop.load(input);
	       // String browser=prop.getProperty("browser");
	        String un=prop.getProperty("username");
	        String pw=prop.getProperty("password");
	        String url=prop.getProperty("url");
	        String wallethuburl=prop.getProperty("walletHubURL");
	        String emailadd=prop.getProperty("emailaddress");
	        String passw=prop.getProperty("pass");
	        String wallethubloginurl=prop.getProperty("walletHubLoginURL");
	       // TestBase.browserName=browser;
	        FacebookLoginTest.userName=un;
	        FacebookLoginTest.passName=pw;
	        FacebookLoginTest.urlName=url;
	        
	        WalletHubSignUpTest.walletHubURL=wallethuburl;
	        WalletHubSignUpTest.emailaddress=emailadd;
	        WalletHubSignUpTest.pass=passw;
	        WalletHubLogInTest.walletHubLogin=wallethubloginurl;
	        WalletHubLogInTest.emailaddress=emailadd;
	        WalletHubLogInTest.pass=passw;

	    } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	   
	}

	}
	


