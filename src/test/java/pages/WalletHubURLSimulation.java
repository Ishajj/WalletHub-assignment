
//This file sets up the locators and objects for Wallet hub review automation webpage

package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WalletHubURLSimulation extends TestBase {

	//WebDriver driver;
	By btn_review=By.xpath("//span[@class='nav-txt'][contains(text(),'Reviews')]");
	By star_icon=By.xpath("//*[@id=\"reviews-section\"]/div[1]/div[3]/review-star/div/svg[4]");
	By ddwn_category=By.xpath("//span[contains(text(),'Select...')]");
	By ta_writereview=By.xpath("//textarea[@placeholder='Write your review...']");
	By btn_submit=By.xpath("//*[contains(text(),'Submit')]");
	By link_profilename=By.className("brgm-list-title");
	By btn_Profile=By.xpath("//*[contains(text(),'Profile')]");
	public static String str;
	
	public WalletHubURLSimulation()
	{
	
	}
	
	public void navigate_to_url()
	{
		
		driver.get("https://wallethub.com/profile/test-insurance-company");	
		
	}
	public void add_review()
	{
		Actions act= new Actions(driver);
		el=driver.findElement(star_icon);
		act.moveToElement(el).click().build().perform();
		str=el.getText();
		wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(ddwn_category));
		Select sel=new Select((WebElement) driver);
		sel.selectByVisibleText("Health Insurance");
		driver.findElement(ta_writereview).click();
		driver.findElement(ta_writereview).sendKeys("This is a group health policy which was taken through TATA AIG and the coverage value of Rs. 3L. I am paying premium yearly Rs. 6000. Its been one year and still there is no claim and this policy covers day care treatment and this can be used till life long.");
		driver.findElement(btn_submit).click();
		el=driver.findElement(link_profilename);
		
		act.moveToElement(el).moveToElement((WebElement) btn_Profile).click().build().perform();
		
		
		
		
		
		
	}
}
