package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AdminPage 
{
	@FindBy(xpath="//li[contains(@class,'dropdown open')]//a[contains(@class,'dropdown-toggle')]")
	WebElement adminpri;
	
	@FindBy(xpath="//a[contains(text(),'Lock/Unlock Authorities')]")
	WebElement lckunlckauthorities;	
	
	@FindBy(xpath="//div[@class='page-title']//h4")
	String titlechk;
	
	@FindBy(xpath="//input[@id='selall']")
	WebElement chkall;
	
	@FindBy(xpath="//div[@class='text-right']//button[@type='button']")
	WebElement updbtn;

	private WebDriver driver;
	
	public AdminPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void adminprivileges()
	{
		adminpri.click();
		lckunlckauthorities.click();
		chkall.click();
		updbtn.click();
	}
	
	public void verifytitle()
	{
	
		Assert.assertTrue((titlechk).contains("Lock/Unlock Authorities"));
		
		//div[@class='page-title']//h4
	}
	
	
}

