package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	WebDriver driver;
	@FindBy(xpath="/html/body/div[12]/div/div[7]/div[1]/div[1]/div[1]/h4/text()") //Home- Dashboard
	WebElement homePageUserName;
  

    public HomePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Get the User name from Home Page
    public String getHomePageDashboardUserName()
    {
        return    homePageUserName.getText();
    }
}