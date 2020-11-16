package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage  
{
	WebDriver driver;
	@FindBy(id="username")
	WebElement uname;
  
	@FindBy(id="password")
	WebElement pwd;
   
    @FindBy(xpath="//html/head/title") //SPP Web Plug-in
    WebElement titleText;
    
    @FindBy(id="btn-login")
    WebElement login;
    
    @FindBy(xpath="//a[contains(text(),'Forgot password?')]")
    WebElement fgtpwd;
    
    @FindBy(id="emailid")
    WebElement getmail;
    
    @FindBy(xpath="//div[@class='panel panel-body login-form']//button[1]")
    WebElement resetpwd;

    public LoginPage(WebDriver driver)
    {
         this.driver = driver;
         PageFactory.initElements(driver, this);
    }

    //Get the title of Login Page
    public String getLoginTitle(WebDriver driver)
    {
        return    titleText.getText();
    }
    public void logineip(String strUserName,String strPasword)  //loginToGuru99
    {

       	uname.sendKeys(strUserName);
       	pwd.sendKeys(strPasword);
        login.click();
        System.out.println("LoginPage - login clicked");
    }

    public void forgetpwd(String mailid)
    {
    	fgtpwd.click();
    	getmail.sendKeys(mailid);
    	resetpwd.click();
    	   	
    }
    
    
}