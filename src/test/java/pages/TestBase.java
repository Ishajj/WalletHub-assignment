

//This is the base class for dynamic browser allocation
package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import config.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase extends PropertiesFile {
    
	
	//public static String browserName;
	public void browser()
	{
		WebDriverManager.chromedriver().setup();
		driver=new FirefoxDriver();

//		if(browserName.equalsIgnoreCase("chrome")) {
//		
//			WebDriverManager.chromedriver().setup();
//			driver=new ChromeDriver();
//		}
//		else 
//		{
//			if(browserName.equalsIgnoreCase("firefox")) {
//				
//			WebDriverManager.firefoxdriver().setup();
//			driver=new FirefoxDriver();	
//			}
//			else {
//				
//			WebDriverManager.iedriver().setup();
//			driver=new InternetExplorerDriver();	
//				
//			}
	}
	}

