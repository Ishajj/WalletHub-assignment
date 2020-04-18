
//This file sets up the locators and objects for Wallethub login webpage

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WalletHubLogin extends TestBase {

	//WebDriver driver;
	By txt_email=By.xpath("//input[@placeholder='Email Address']");
	By txt_pass=By.xpath("//input[@placeholder='Password']");
    By btn_login=By.xpath("//button[@class='btn blue center reg-tabs-bt touch-element-cl']");
	
	public WalletHubLogin()
	{
	
	}
	
	public void enter_login_details(String email,String pass)
	{
		
		wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(txt_email));
		driver.findElement(txt_email).sendKeys(email);
		wait.until(ExpectedConditions.visibilityOfElementLocated(txt_pass));
		driver.findElement(txt_pass).sendKeys(pass);
		driver.findElement(btn_login).click();	
		
	}
}
