
//This file sets up the locators and objects for Wallethub Signup webpage

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WalletHubSignUp extends TestBase {

	//WebDriver driver;
	By txt_email=By.xpath("//input[@placeholder='Email Address']");
	By txt_pass=By.xpath("//input[@placeholder='Password']");
	By txt_confpass=By.xpath("//input[@placeholder='Confirm Password']");
	By cb_credit=By.xpath("//span[contains(text(),'Get my free credit score & report')]");
	By btn_join=By.xpath("//button[@class='btn blue touch-element-cl']");
	
	public WalletHubSignUp()
	{
	
	}
	
	public void enter_signup_details(String email,String pass,String confpass)
	{
		
		wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(txt_email));
		driver.findElement(txt_email).sendKeys(email);
		wait.until(ExpectedConditions.visibilityOfElementLocated(txt_pass));
		driver.findElement(txt_pass).sendKeys(pass);
		wait.until(ExpectedConditions.visibilityOfElementLocated(txt_confpass));
		driver.findElement(txt_confpass).sendKeys(confpass);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		el=driver.findElement(cb_credit);
		js.executeScript("arguments[0].click", el);
		driver.findElement(btn_join).click();	
		
	}
}
